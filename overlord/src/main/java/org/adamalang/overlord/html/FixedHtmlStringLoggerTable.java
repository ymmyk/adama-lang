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
package org.adamalang.overlord.html;

/** a fixed log that is shown via HTML */
public class FixedHtmlStringLoggerTable {

  private final String begin;
  private final String[] rows;
  private final String end;
  private int at;

  public FixedHtmlStringLoggerTable(int n, String... labels) {
    this.rows = new String[n];

    StringBuilder beginBuffer = new StringBuilder();
    beginBuffer.append("<table><tr>");
    for (String label : labels) {
      beginBuffer.append("<th>").append(label).append("</th>");
    }
    beginBuffer.append("</tr>\n");
    this.begin = beginBuffer.toString();
    for (int k = 0; k < n; k++) {
      rows[k] = null;
    }
    this.end = "</table>";
    at = 0;
  }

  public void row(String... vals) {
    StringBuilder rowBuffer = new StringBuilder();
    rowBuffer.append("<tr>");
    for (String val : vals) {
      rowBuffer.append("<td>").append(val).append("</td>");
    }
    rowBuffer.append("</tr>");
    rows[at] = rowBuffer.toString();
    at++;
    at %= rows.length;
  }

  public String toHtml(String title) {
    StringBuilder html = new StringBuilder();
    html.append("<html><head><title>").append(title).append("</title></head><body>\n");
    html.append("<h1>Activity</h1>");
    html.append(begin);
    for (int k = 0; k < rows.length; k++) {
      int j = (at + k) % rows.length;
      if (rows[j] != null) {
        html.append(rows[j]);
      }
    }
    html.append(end);
    html.append("</body></html>");
    return html.toString();
  }
}
