package org.vincent.demo.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.SpellCheckerImpl4;
import org.vincent.demo.service.impl.SpellCheckerImpl6;

// Declaring beans
public class TextEditorModule2 extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("jdbcUrl")).toInstance("this is jdbc url value");
        bind(SpellChecker.class).annotatedWith(Names.named("spellCheckerImpl4")).to(SpellCheckerImpl4.class);
        bind(SpellChecker.class).annotatedWith(Names.named("spellCheckerImpl6")).to(SpellCheckerImpl6.class);
    }
}