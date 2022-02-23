package org.vincent.demo.service.facade;

import org.vincent.demo.annotation.WinWord;
import org.vincent.demo.service.SpellChecker;

import com.google.inject.Inject;

public class TextEditor {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor(@WinWord SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}