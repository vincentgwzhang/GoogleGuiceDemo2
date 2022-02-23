package org.vincent.demo.service.impl;

import com.google.inject.Singleton;
import org.vincent.demo.annotation.AroundLog;
import org.vincent.demo.service.SpellChecker;

@Singleton
public class SpellCheckerImpl7 implements SpellChecker {

    @Override
    @AroundLog
    public void checkSpelling() {
        System.out.println("SpellCheckerImpl7 is working" );
    }
}