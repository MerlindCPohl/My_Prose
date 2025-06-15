/* SPDX-FileCopyrightText: 2025 Johannes Kristan
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 *  SPDX-License-Identifier: MIT
 */
package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.Sentence;

import java.util.List;

public class ExampleSentence implements Sentence {
    @Override
    public List<String> getWords() {
        return List.of();
    }

    @Override
    public String getText() {
        return "";
    }

    @Override
    public String get() {
        return "Es steckt oft mehr Geist und Scharfsinn in einem Irrtum als in einer Entdeckung."; // (Joseph Joubert);
    }
}
