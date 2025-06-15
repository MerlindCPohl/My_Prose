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