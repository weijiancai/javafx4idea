package com.wjc.javafx4idea.fxml;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author weijiancai
 * @since 0.0.1
 */
public class FXMLFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        System.out.println("FXMLFileTypeFactory............");
        consumer.consume(FXMLFileType.FILE_TYPE, FXMLFileType.DEFAULT_EXTENSION);
    }
}
