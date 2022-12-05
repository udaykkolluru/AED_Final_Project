/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neuuday.assignment1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author udaykk
 */
public class UtilClass {

    public static boolean isOnlyNumber(String str) {
        try {
            return ((str != null) && (!str.equals(""))
                    && str.length() < 4 && (str.chars().allMatch(ch -> Character.isDigit(ch))));
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean isOnlyText(String str) {
        try {
            return ((str != null) && (!str.equals(""))
                    && (str.chars().allMatch(ch -> Character.isLetter(ch))));
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isOnlyTextWithWhiteSpaces(String str) {
        try {
            return ((str != null) && (!str.equals(""))
                    && (str.chars().allMatch(ch -> Character.isLetter(ch) || Character.isWhitespace(ch))));
        } catch (Exception e) {
            return false;
        }
    }

    public static Date convertStringToDate(String str) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(str);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static String convertDateToString(Date date) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            return formatter.format(date);
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean isEmailValidated(String email) {
        try {
            String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isPhoneNumberVerified(String phone) {
        try {
            String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phone);
            return matcher.matches();
        } catch (Exception e) {
            return false;
        }
    }

}
