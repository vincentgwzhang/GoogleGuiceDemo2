package org.vincent.demo.modules;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;
import org.vincent.demo.annotation.AroundLog;
import org.vincent.demo.service.SpellChecker;
import org.vincent.demo.service.impl.AroundLogService;
import org.vincent.demo.service.impl.SpellCheckerImpl7;

public class AOPModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).annotatedWith(Names.named("spellCheckerImpl7")).to(SpellCheckerImpl7.class);
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(AroundLog.class), new AroundLogService());
    }

}
