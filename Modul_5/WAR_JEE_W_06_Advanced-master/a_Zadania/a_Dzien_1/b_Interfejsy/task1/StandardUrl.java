package a_Zadania.a_Dzien_1.b_Interfejsy.task1;

import java.util.regex.Matcher;

import java.util.regex.Pattern;



import java.util.regex.Matcher;

import java.util.regex.Pattern;

class StandardUrl implements Url {

    @Override
    public String getParams(String name, String url) {

        String param = "";
        Pattern pattern = Pattern.compile(name + "=([^&]+)");

        Matcher m = pattern.matcher(url);

        if (m.find()) {
            param = m.group(1);
        }
        return param;
    }
}