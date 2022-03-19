package org.vincent.demo.modules;

import com.google.inject.AbstractModule;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.SpellCheckerImpl10A;
import org.vincent.demo.service.impl.SpellCheckerImpl10B;

public class ConstructBindingModule extends AbstractModule {
    @Override
    protected void configure() {
        try {
            bind(SpellChecker.class).toConstructor(SpellCheckerImpl10A.class.getConstructor(SpellCheckerImpl10B.class));
            bind(SpellCheckerImpl10A.class);
        } catch (NoSuchMethodException e) {
            addError(e);
        }
    }
}
