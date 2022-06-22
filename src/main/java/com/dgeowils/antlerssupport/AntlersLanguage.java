package com.dgeowils.antlerssupport;

import com.intellij.lang.Language;

public class AntlersLanguage extends Language {

    public static final AntlersLanguage INSTANCE = new AntlersLanguage();

    private AntlersLanguage() {
        super("Antlers");
    }

}