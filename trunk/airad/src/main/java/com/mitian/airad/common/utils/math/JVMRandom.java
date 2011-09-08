/*
 * Copyright 2010 Focus Technology, Co., Ltd. All rights reserved.
 */
package com.mitian.airad.common.utils.math;

import java.util.Random;

/**
 * @author zhoufengbo
 * @see apache-commons
 */
public final class JVMRandom extends Random {

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * Ensures that only the constructor can call reseed.
     */
    private boolean constructed = false;

    /**
     * Constructs a new instance.
     */
    public JVMRandom() {
        constructed = true;
    }

    /**
     * Unsupported in 2.0.
     * 
     * @param seed ignored
     * @throws UnsupportedOperationException
     */
    @Override
    public synchronized void setSeed(long seed) {
        if (constructed) {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Unsupported in 2.0.
     * 
     * @return Nothing, this method always throws an UnsupportedOperationException.
     * @throws UnsupportedOperationException
     */
    @Override
    public synchronized double nextGaussian() {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported in 2.0.
     * 
     * @param byteArray ignored
     * @throws UnsupportedOperationException
     */
    @Override
    public void nextBytes(byte[] byteArray) {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the next pseudorandom, uniformly distributed int value from the Math.random() sequence.
     * </p>
     * 
     * @return the random int
     */
    @Override
    public int nextInt() {
        return nextInt(Integer.MAX_VALUE);
    }

    /**
     * <p>
     * Returns a pseudorandom, uniformly distributed int value between <code>0</code> (inclusive) and the specified
     * value (exclusive), from the Math.random() sequence.
     * </p>
     * 
     * @param n the specified exclusive max-value
     * @return the random int
     * @throws IllegalArgumentException when <code>n &lt;= 0</code>
     */
    @Override
    public int nextInt(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Upper bound for nextInt must be positive");
        }
        // TODO: check this cannot return 'n'
        return (int) (Math.random() * n);
    }

    /**
     * <p>
     * Returns the next pseudorandom, uniformly distributed long value from the Math.random() sequence.
     * </p>
     * 
     * @return the random long
     */
    @Override
    public long nextLong() {
        // possible loss of precision?
        return nextLong(Long.MAX_VALUE);
    }

    /**
     * <p>
     * Returns a pseudorandom, uniformly distributed long value between <code>0</code> (inclusive) and the specified
     * value (exclusive), from the Math.random() sequence.
     * </p>
     * 
     * @param n the specified exclusive max-value
     * @return the random long
     * @throws IllegalArgumentException when <code>n &lt;= 0</code>
     */
    public static long nextLong(long n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Upper bound for nextInt must be positive");
        }
        // TODO: check this cannot return 'n'
        return (long) (Math.random() * n);
    }

    /**
     * <p>
     * Returns the next pseudorandom, uniformly distributed boolean value from the Math.random() sequence.
     * </p>
     * 
     * @return the random boolean
     */
    @Override
    public boolean nextBoolean() {
        return Math.random() > 0.5;
    }

    /**
     * <p>
     * Returns the next pseudorandom, uniformly distributed float value between <code>0.0</code> and <code>1.0</code>
     * from the Math.random() sequence.
     * </p>
     * 
     * @return the random float
     */
    @Override
    public float nextFloat() {
        return (float) Math.random();
    }

    /**
     * <p>
     * Synonymous to the Math.random() call.
     * </p>
     * 
     * @return the random double
     */
    @Override
    public double nextDouble() {
        return Math.random();
    }

}
