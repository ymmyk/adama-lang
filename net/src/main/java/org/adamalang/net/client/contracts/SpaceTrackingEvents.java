/*
* Adama Platform and Language
* Copyright (C) 2021 - 2023 by Adama Platform Initiative, LLC
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published
* by the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU Affero General Public License for more details.
* 
* You should have received a copy of the GNU Affero General Public License
* along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package org.adamalang.net.client.contracts;

import java.util.Set;

/** events for space routing */
@Deprecated
public interface SpaceTrackingEvents {
  /** a request created the new to track a space */
  void gainInterestInSpace(String space);

  /** the targets within the routing table for a space changed */
  void shareTargetsFor(String space, Set<String> targets);

  /** we lost interest in a space */
  void lostInterestInSpace(String space);

  public static final SpaceTrackingEvents NoOp = new SpaceTrackingEvents() {
    @Override
    public void gainInterestInSpace(String space) {
    }

    @Override
    public void shareTargetsFor(String space, Set<String> targets) {
    }

    @Override
    public void lostInterestInSpace(String space) {
    }
  };
}
