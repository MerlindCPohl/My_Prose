/* SPDX-FileCopyrightText: 2025 Johannes Kristan
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 *  SPDX-License-Identifier: MIT
 */
package de.htw_berlin.fb4.ossd.prose;

import java.util.List;

public interface Prose {
    String get();
    String getText();                    // gesamter Text
    List<Sentence> getSentences();

}
