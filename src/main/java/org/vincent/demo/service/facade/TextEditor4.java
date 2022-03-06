package org.vincent.demo.service.facade;

import com.google.inject.Inject;
import org.vincent.demo.service.SpellChecker;

public class TextEditor4 {

    @Inject(optional=true)
    private SpellChecker spellChecker2;

    public void makeSpellCheck(){
        spellChecker2.checkSpelling();
    }
}