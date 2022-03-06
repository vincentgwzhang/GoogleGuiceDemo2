package org.vincent.demo.modules;

import com.google.inject.AbstractModule;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.SpellCheckerImpl;

// Declaring beans
public class TextEditorModule1 extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
    }
}