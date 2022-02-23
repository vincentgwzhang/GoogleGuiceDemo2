package org.vincent.demo.service.facade;

import org.vincent.demo.service.SpellChecker;

import com.google.inject.Inject;
import javax.inject.Named;

public class TextEditor3 {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor3(@Named("spellCheckerImpl4") SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}