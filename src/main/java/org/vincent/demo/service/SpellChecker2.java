package org.vincent.demo.service;

import com.google.inject.ImplementedBy;
import org.vincent.demo.service.impl.SpellCheckerImpl5;

@ImplementedBy(SpellCheckerImpl5.class)
public interface SpellChecker2 {
    public void checkSpelling();
}
