package com.wjc.javafx4idea.fxml;

import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.fileEditor.FileEditorPolicy;
import com.intellij.openapi.fileEditor.FileEditorProvider;
import com.intellij.openapi.fileEditor.FileEditorState;
import com.intellij.openapi.fileEditor.impl.text.TextEditorState;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

/**
 * FXML UI设计器 提供者
 *
 * @author weijiancai
 * @since 0.0.1
 */
public class FxmlDesignEditorProvider implements FileEditorProvider{
    @Override
    public boolean accept(@NotNull Project project, @NotNull VirtualFile file) {
        return "fxml".equals(file.getExtension());
    }

    @NotNull
    @Override
    public FileEditor createEditor(@NotNull Project project, @NotNull VirtualFile file) {
        System.out.println("Create FXML File Editor......");
        return new FxmlDesignEditor();
    }

    @Override
    public void disposeEditor(@NotNull FileEditor editor) {
        System.out.println("Dispose FXML File Editor......");
    }

    @NotNull
    @Override
    public FileEditorState readState(@NotNull Element sourceElement, @NotNull Project project, @NotNull VirtualFile file) {
        return new TextEditorState();
    }

    @Override
    public void writeState(@NotNull FileEditorState state, @NotNull Project project, @NotNull Element targetElement) {
    }

    @NotNull
    @Override
    public String getEditorTypeId() {
        return "FXML-Design-Editor";
    }

    @NotNull
    @Override
    public FileEditorPolicy getPolicy() {
        return FileEditorPolicy.NONE;
    }
}
