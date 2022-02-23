package org.vincent.demo.service.facade;

import com.google.inject.Inject;
import org.vincent.demo.service.SpellChecker2;

public class TextEditor4 {

    @Inject(optional=true)
    private SpellChecker2 spellChecker2;

    public void makeSpellCheck(){
        spellChecker2.checkSpelling();
    }
}