package org.vincent.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;
import org.vincent.demo.modules.AOPModule;
import org.vincent.demo.modules.BindingAnnotationModule;
import org.vincent.demo.modules.ConstructBindingModule;
import org.vincent.demo.modules.LinkedBindingModule;
import org.vincent.demo.modules.TextEditorModule1;
import org.vincent.demo.modules.TextEditorModule2;
import org.vincent.demo.modules.TextEditorModule3;
import org.vincent.demo.modules.TextEditorModule4;
import org.vincent.demo.modules.TextEditorModule5;
import org.vincent.demo.modules.TextEditorModule6;
import org.vincent.demo.service.facade.TextEditor;
import org.vincent.demo.service.facade.TextEditor1;
import org.vincent.demo.service.facade.TextEditor10;
import org.vincent.demo.service.facade.TextEditor2;
import org.vincent.demo.service.facade.TextEditor3;
import org.vincent.demo.service.facade.TextEditor4;
import org.vincent.demo.service.facade.TextEditor5;
import org.vincent.demo.service.facade.TextEditor6;
import org.vincent.demo.service.facade.TextEditor8;
import org.vincent.demo.service.facade.TextEditor9;

public class ApplicationEntry {

    private Injector injector;

    @Test
    public void test1() {
        injector = Guice.createInjector(new TextEditorModule1());
        TextEditor1 editor1 = injector.getInstance(TextEditor1.class);
        editor1.makeSpellCheck();
    }

    @Test
    public void test2() {
        injector = Guice.createInjector(new TextEditorModule2());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }

    @Test
    public void test3() {
        injector = Guice.createInjector(new TextEditorModule3());
        TextEditor2 editor2 = injector.getInstance(TextEditor2.class);
        editor2.makeSpellCheck();
    }

    @Test
    public void test4() {
        injector = Guice.createInjector(new TextEditorModule4());
        TextEditor3 editor3 = injector.getInstance(TextEditor3.class);
        editor3.makeSpellCheck();
    }

    @Test
    public void test5() {
        injector = Guice.createInjector(new TextEditorModule5());
        TextEditor4 editor4 = injector.getInstance(TextEditor4.class);
        editor4.makeSpellCheck();
    }

    @Test
    public void test6() {
        injector = Guice.createInjector(new TextEditorModule6());
        TextEditor5 editor5 = injector.getInstance(TextEditor5.class);
        editor5.makeSpellCheck();
    }

    @Test
    public void testAOP() {
        injector = Guice.createInjector(new AOPModule());
        TextEditor6 editor6 = injector.getInstance(TextEditor6.class);
        editor6.makeSpellCheck();
    }

    @Test
    public void testLinkedBinding() {
        injector = Guice.createInjector(new LinkedBindingModule());
        TextEditor8 textEditor8 = injector.getInstance(TextEditor8.class);
        textEditor8.makeSpellCheck();
    }

    @Test
    public void testBindingAnnotation() {
        injector = Guice.createInjector(new BindingAnnotationModule());
        TextEditor9 textEditor9 = injector.getInstance(TextEditor9.class);
        textEditor9.makeSpellCheck();
    }

    @Test
    public void testConstructorBinding() {
        injector = Guice.createInjector(new ConstructBindingModule());
        TextEditor10 textEditor10 = injector.getInstance(TextEditor10.class);
        textEditor10.makeSpellCheck();
    }

}
