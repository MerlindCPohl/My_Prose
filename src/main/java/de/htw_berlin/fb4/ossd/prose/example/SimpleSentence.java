/*
 * Copyright (C) 2025 Merlind Pohl
 *
 * This file is part of the project submitted for Homework Assignment 5.
 *
 * SPDX-License-Identifier: LGPL-3.0
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */


package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.Sentence;

import java.util.Arrays;
import java.util.List;

public class SimpleSentence implements Sentence {

    private final String sentence;

    //Konstruktpr
    public SimpleSentence(String sentence) {
        this.sentence = sentence; // Hier wird die Variable sicher initialisiert
    }

    @Override
    public String get() {
        return sentence;
    }

    @Override
    public List<String> getWords() {
        return Arrays.asList(sentence.replaceAll("[.,!?]", "").split("\\s+"));
    }

    @Override
    public String getText() {
        return sentence;
    }
}
