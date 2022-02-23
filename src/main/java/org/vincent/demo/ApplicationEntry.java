package org.vincent.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.vincent.demo.modules.AOPModule;
import org.vincent.demo.modules.TextEditorModule;
import org.vincent.demo.modules.TextEditorModule2;
import org.vincent.demo.service.facade.*;

public class ApplicationEntry {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule(), new TextEditorModule2(), new AOPModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        TextEditor2 editor2 = injector.getInstance(TextEditor2.class);
        TextEditor3 editor3 = injector.getInstance(TextEditor3.class);
        TextEditor4 editor4 = injector.getInstance(TextEditor4.class);
        TextEditor5 editor5 = injector.getInstance(TextEditor5.class);
        TextEditor6 editor6 = injector.getInstance(TextEditor6.class);
        editor6.makeSpellCheck();
    }

}
