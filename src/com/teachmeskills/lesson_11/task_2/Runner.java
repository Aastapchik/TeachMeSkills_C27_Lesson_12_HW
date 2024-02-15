package com.teachmeskills.lesson_11.task_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    static final String NUMPHONE_REGEX = "\\+\\(\\d{2}\\)\\d{7}";
    static final String NUMDOC_REGEX = "\\d{4}-\\d{4}-\\d{2}";
    static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})";
    public static void main(String[] args) {



        String text = "Aastapchik@inbox.rudfdfs it is my e-mail adress my phone number is +(25)7842564, doc number is 1542-6724-90  7741-5412-85";

        Pattern patternMail = Pattern.compile(EMAIL_REGEX);
        Matcher matcherMail = patternMail.matcher(text);

        if (matcherMail.find()) System.out.println("E-mail адрес: " + matcherMail.group());

        Pattern patterPhone = Pattern.compile(NUMPHONE_REGEX);
        Matcher matcherPhone = patterPhone.matcher(text);

        if (matcherPhone.find()) System.out.println("Номер телефона: " + matcherPhone.group());
        Pattern patternDoc = Pattern.compile(NUMDOC_REGEX);

        Matcher matcherDoc = patternDoc.matcher(text);

        int count = 0;
        while (matcherDoc.find()) {
            if (count == 0) System.out.print("Номер документа: ");
            System.out.print(matcherDoc.group() + ", ");
            count++;
        }


    }

}
