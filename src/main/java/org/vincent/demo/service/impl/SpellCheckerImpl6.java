package org.vincent.demo.service.impl;

import com.google.inject.Singleton;
import org.vincent.demo.service.SpellChecker;

@Singleton
public class SpellCheckerImpl6 implements SpellChecker {

    @Override
    public void checkSpelling() {
        System.out.println("SpellCheckerImpl6 is working" );
    }
}