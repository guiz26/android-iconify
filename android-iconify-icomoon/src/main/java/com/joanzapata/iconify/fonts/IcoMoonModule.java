package com.joanzapata.iconify.fonts;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class IcoMoonModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-icomoon.ttf";
    }

    @Override
    public Icon[] characters() {
        return IcoMoonIcons.values();
    }
}
