package com.dgeowils.antlerssupport;// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.


import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AntlersFileType extends LanguageFileType {

    public static final AntlersFileType INSTANCE = new AntlersFileType();

    private AntlersFileType() {
        super(AntlersLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Antlers File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Antlers language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "*.antlers.html";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AntlersIcons.FILE;
    }

}