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
