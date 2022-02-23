package org.vincent.demo.service.facade;

import com.google.inject.Inject;
import org.vincent.demo.service.SpellChecker;

import javax.inject.Named;

public class TextEditor5 {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor5(@Named("spellCheckerImpl6") SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}