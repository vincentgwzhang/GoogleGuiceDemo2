package org.vincent.demo.service.facade;

import com.google.inject.Inject;
import org.vincent.demo.service.SpellChecker;

public class TextEditor8 {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor8(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}