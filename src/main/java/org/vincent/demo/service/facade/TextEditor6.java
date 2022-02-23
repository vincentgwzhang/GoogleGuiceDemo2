package org.vincent.demo.service.facade;

import com.google.inject.Inject;
import org.vincent.demo.service.SpellChecker;

import javax.inject.Named;

public class TextEditor6 {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor6(@Named("spellCheckerImpl7") SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}