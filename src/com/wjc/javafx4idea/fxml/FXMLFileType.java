package com.wjc.javafx4idea.fxml;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * FXML 文件类型
 *
 * @author weijiancai
 * @since 0.0.1
 */
public class FXMLFileType extends LanguageFileType {
    public static final Icon FILE_ICON = IconLoader.getIcon("/fileTypes/batch.png");
    public static final LanguageFileType FILE_TYPE = new FXMLFileType();
    @NonNls
    public static final String DEFAULT_EXTENSION = "fxml";
    @NonNls public static final String DOT_DEFAULT_EXTENSION = "." + DEFAULT_EXTENSION;

    protected FXMLFileType() {
        super(FXMLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "FXML";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "FXML files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public Icon getIcon() {
        return null;
    }
}
