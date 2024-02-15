package com.teachmeskills.lesson_11.task_1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    static final String ABB_REG = "\\s*(\\s|,|)[A-Z]{3,6}\\s*";
    public static void main(String[] args) {


        String words = "ASDF FDFC, FDefef DFSFCААА sqdsd";
        Pattern pattern = Pattern.compile(ABB_REG);
        Matcher matcher = pattern.matcher(words);
        while(matcher.find()) System.out.println(matcher.group());

    }
}
