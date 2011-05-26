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
 * The <code>UserNotFoundException</code> exception is thrown when application
 * tries to access data for user which does not exist in repository.
 * <p>
 * Created: Wed Oct 27 14:17:44 2004
 * </p>
 * @author <a href="mailto:artur.hefczyc@tigase.org">Artur Hefczyc</a>
 * @version $Rev: 630 $
 */
public class UserNotFoundException extends TigaseDBException {

  private static final long serialVersionUID = 1L;

  /**
   * Creates a new <code>UserNotFoundException</code> instance.
   *
   */
  public UserNotFoundException(String message) { super(message); }

  /**
   * Creates a new <code>UserNotFoundException</code> instance.
   *
   */
  public UserNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

} // UserNotFoundException