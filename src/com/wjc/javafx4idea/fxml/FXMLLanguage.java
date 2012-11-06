package com.wjc.javafx4idea.fxml;

import com.intellij.lang.Language;

/**
 *
 * @author weijiancai
 * @since 0.0.1
 */
public class FXMLLanguage extends Language{
    public static final FXMLLanguage INSTANCE = new FXMLLanguage();

    protected FXMLLanguage() {
        super("FXML", "application/x-fxml", "application/x-fxml", "text/fxml");
        /*SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
            @NotNull
            @Override
            protected SyntaxHighlighter createHighlighter() {
                return new AssemblyHighlighter();
            }
        });*/
    }
}
