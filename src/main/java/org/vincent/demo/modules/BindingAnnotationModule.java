package org.vincent.demo.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.vincent.demo.annotation.GoogleCheckout;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.SpellCheckerImpl9;

public class BindingAnnotationModule extends AbstractModule {

    @Provides
    @GoogleCheckout
    public SpellChecker spellCheckerImpl9(SpellCheckerImpl9 impl) {
        return impl;
    }

}
