package org.vincent.demo.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.SpellCheckerImpl8;

public class LinkedBindingModule extends AbstractModule {

    @Provides
    public SpellChecker provideSpellChecker(SpellCheckerImpl8 impl) {
        return impl;
    }

}
