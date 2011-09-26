/*
 * Copyright 2010 Focus Technology, Co., Ltd. All rights reserved.
 */
package com.mitian.airad.common.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import org.apache.commons.lang.SerializationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 序列化工具类
 * 
 * @author zhoufengbo
 * @see apache-commons
 */
public abstract class SerializationUtils {
    private static final Log LOGGER = LogFactory.getLog(SerializationUtils.class);

    /**
     * <p>
     * SerializationUtils instances should NOT be constructed in standard programming. Instead, the class should be used
     * as <code>SerializationUtils.clone(object)</code>.
     * </p>
     * <p>
     * This constructor is public to permit tools that require a JavaBean instance to operate.
     * </p>
     * 
     * @since 2.0
     */
    private SerializationUtils() {
        super();
    }

    // Clone
    // -----------------------------------------------------------------------
    /**
     * <p>
     * Deep clone an <code>Object</code> using serialization.
     * </p>
     * <p>
     * This is many times slower than writing clone methods by hand on all objects in your object graph. However, for
     * complex object graphs, or for those that don't support deep cloning this can be a simple alternative
     * implementation. Of course all the objects must be <code>Serializable</code>.
     * </p>
     * 
     * @param object the <code>Serializable</code> object to clone
     * @return the cloned object
     */
    public static Object clone(Serializable object) {
        return deserialize(serialize(object));
    }

    // Serialize
    // -----------------------------------------------------------------------
    /**
     * <p>
     * Serializes an <code>Object</code> to the specified stream.
     * </p>
     * <p>
     * The stream will be closed once the object is written. This avoids the need for a finally clause, and maybe also
     * exception handling, in the application code.
     * </p>
     * <p>
     * The stream passed in is not buffered internally within this method. This is the responsibility of your
     * application if desired.
     * </p>
     * 
     * @param obj the object to serialize to bytes, may be null
     * @param outputStream the stream to write to, must not be null
     */
    public static void serialize(Serializable obj, OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("The OutputStream must not be null");
        }
        ObjectOutputStream out = null;
        try {
            // stream closed in the finally
            out = new ObjectOutputStream(outputStream);
            out.writeObject(obj);

        }
        catch (IOException ex) {
            throw new SerializationException(ex);
        }
        finally {
            try {
                if (out != null) {
                    out.close();
                }
            }
            catch (IOException ex) {
                LOGGER.error("流关闭异常" + ex.getMessage());
            }
        }
    }

    /**
     * <p>
     * Serializes an <code>Object</code> to a byte array for storage/serialization.
     * </p>
     * 
     * @param obj the object to serialize to bytes
     * @return a byte[] with the converted Serializable
     */
    public static byte[] serialize(Serializable obj) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
        serialize(obj, baos);
        return baos.toByteArray();
    }

    // Deserialize
    // -----------------------------------------------------------------------
    /**
     * <p>
     * Deserializes an <code>Object</code> from the specified stream.
     * </p>
     * <p>
     * The stream will be closed once the object is written. This avoids the need for a finally clause, and maybe also
     * exception handling, in the application code.
     * </p>
     * <p>
     * The stream passed in is not buffered internally within this method. This is the responsibility of your
     * application if desired.
     * </p>
     * 
     * @param inputStream the serialized object input stream, must not be null
     * @return the deserialized object
     */
    public static Object deserialize(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("The InputStream must not be null");
        }
        ObjectInputStream in = null;
        try {
            // stream closed in the finally
            in = new ObjectInputStream(inputStream);
            return in.readObject();

        }
        catch (ClassNotFoundException ex) {
            throw new SerializationException(ex);
        }
        catch (IOException ex) {
            throw new SerializationException(ex);
        }
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            }
            catch (IOException ex) {
                LOGGER.error("流关闭异常" + ex.getMessage());
            }
        }
    }

    /**
     * <p>
     * Deserializes a single <code>Object</code> from an array of bytes.
     * </p>
     * 
     * @param objectData the serialized object, must not be null
     * @return the deserialized object
     */
    public static Object deserialize(byte[] objectData) {
        if (objectData == null) {
            throw new IllegalArgumentException("The byte[] must not be null");
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(objectData);
        return deserialize(bais);
    }

}
