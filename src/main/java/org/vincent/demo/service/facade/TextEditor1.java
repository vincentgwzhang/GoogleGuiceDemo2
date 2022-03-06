package org.vincent.demo.service.facade;

import com.google.inject.Inject;
import org.vincent.demo.service.SpellChecker;

public class TextEditor1 {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor1(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}