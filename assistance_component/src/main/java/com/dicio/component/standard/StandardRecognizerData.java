package com.dicio.component.standard;

import com.dicio.component.InputRecognizer;

public class StandardRecognizerData {
    private final InputRecognizer.Specificity specificity;
    private final Sentence[] sentences;

    public StandardRecognizerData(InputRecognizer.Specificity specificity, Sentence... sentences) {
        this.specificity = specificity;
        this.sentences = sentences;
    }

    public InputRecognizer.Specificity getSpecificity() {
        return specificity;
    }

    public Sentence[] getSentences() {
        return sentences;
    }
}
