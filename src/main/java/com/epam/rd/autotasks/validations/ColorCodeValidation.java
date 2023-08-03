package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {

        if (color == null) return false;
        if (!color.contains("#") ) return false;


        Pattern p1 = Pattern.compile("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
        Matcher matcher = p1.matcher(color);
        return matcher.find();

    }
}





