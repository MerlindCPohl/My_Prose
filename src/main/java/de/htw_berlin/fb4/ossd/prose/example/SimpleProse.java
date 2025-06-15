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

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleProse implements Prose {
    private final List<Sentence> sentences;

    //konstruktor
    public SimpleProse(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String get() {
        return getText();
    }

    public String getText() {
        StringBuilder sb = new StringBuilder();
        sentences.forEach(sentence -> sb.append(sentence.get()).append("\n"));
        return sb.toString().trim();
    }

    @Override
    public List<Sentence> getSentences() {
        return List.of();
    }

    // alle Wörter alphabetisch
    public List<String> getAllWordsSorted() {
            return sentences.stream()
                    .flatMap(s -> s.getWords().stream())
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .collect(Collectors.toList());
        }
    }