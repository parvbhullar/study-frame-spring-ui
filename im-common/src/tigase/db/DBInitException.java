/*
 * Tigase Jabber/XMPP Server
 * Copyright (C) 2004-2007 "Artur Hefczyc" <artur.hefczyc@tigase.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. Look for COPYING file in the top folder.
 * If not, see http://www.gnu.org/licenses/.
 *
 * $Rev: 630 $
 * Last modified by $Author: kobit $
 * $Date: 2007-07-19 01:38:28 +0800 (周四, 19 七月 2007) $
 */
package tigase.db;

/**
 * Describe class DBInitException here.
 *
 *
 * Created: Thu Oct 26 12:18:05 2006
 *
 * @author <a href="mailto:artur.hefczyc@tigase.org">Artur Hefczyc</a>
 * @version $Rev: 630 $
 */
public class DBInitException extends TigaseDBException {

  private static final long serialVersionUID = 1L;

	public DBInitException(String message) { super(message); }

  public DBInitException(String message, Throwable cause) {
    super(message, cause);
  }

} // DBInitException