package org.vincent.demo.service.facade;

import com.google.inject.Inject;
import org.vincent.demo.annotation.GoogleCheckout;
import org.vincent.demo.service.SpellChecker;

public class TextEditor9 {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor9(@GoogleCheckout SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}