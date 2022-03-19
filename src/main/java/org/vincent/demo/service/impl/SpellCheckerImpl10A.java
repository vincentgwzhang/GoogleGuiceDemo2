package org.vincent.demo.service.impl;

import com.google.inject.Inject;
import org.vincent.demo.service.SpellChecker;

public class SpellCheckerImpl10A implements SpellChecker {

    private SpellChecker spellChecker;

    @Inject
    public SpellCheckerImpl10A(SpellCheckerImpl10B spellChecker) {
        this.spellChecker = spellChecker;
    }

    @Override
    public void checkSpelling() {
        spellChecker.checkSpelling();
    }

}