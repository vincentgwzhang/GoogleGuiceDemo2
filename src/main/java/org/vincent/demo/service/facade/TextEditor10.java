package org.vincent.demo.service.facade;

import com.google.inject.Inject;
import org.vincent.demo.annotation.GoogleCheckout;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.SpellCheckerImpl10A;

public class TextEditor10 {

    private SpellCheckerImpl10A spellCheckerImpl10A;

    @Inject
    public TextEditor10(SpellCheckerImpl10A spellCheckerImpl10A) {
        this.spellCheckerImpl10A = spellCheckerImpl10A;
    }

    public void makeSpellCheck(){
        spellCheckerImpl10A.checkSpelling();
    }
}