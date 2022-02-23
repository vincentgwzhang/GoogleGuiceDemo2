package org.vincent.demo.service.facade;

import org.vincent.demo.service.SpellChecker;

import com.google.inject.Inject;
import javax.inject.Named;

public class TextEditor2 {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor2(@Named("spellCheckerImpl3") SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}