package org.vincent.demo.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.SpellCheckerImpl3;

// Declaring beans
public class TextEditorModule3 extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpellChecker.class).annotatedWith(Names.named("spellCheckerImpl3")).to(SpellCheckerImpl3.class);
    }
}