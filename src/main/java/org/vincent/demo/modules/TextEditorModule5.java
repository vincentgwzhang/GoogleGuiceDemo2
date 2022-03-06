package org.vincent.demo.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.vincent.demo.annotation.WinWord;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.SpellCheckerImpl2;
import org.vincent.demo.service.impl.SpellCheckerImpl4;

// Declaring beans
public class TextEditorModule5 extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl2.class);
    }
}