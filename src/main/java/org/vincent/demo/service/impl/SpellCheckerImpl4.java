package org.vincent.demo.service.impl;

import org.vincent.demo.service.SpellChecker;

import com.google.inject.Inject;
import javax.inject.Named;

public class SpellCheckerImpl4 implements SpellChecker {

    @Inject
    @Named("jdbcUrl")
    private String url;

    public SpellCheckerImpl4() {
    }

    @Override
    public void checkSpelling() {
        System.out.println("SpellCheckerImpl4 is working:" + url );
    }
}