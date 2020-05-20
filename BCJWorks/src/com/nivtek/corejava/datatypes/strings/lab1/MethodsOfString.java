/**
 * 
 */
package com.nivtek.corejava.datatypes.strings.lab1;

import java.util.ArrayList;

/**
 * @author Bootcamp User 017
 *
 */
public class MethodsOfString {

    public int getNumberOfWords(String input) {

        String[] wordsArray = input.split(" ");
        return wordsArray.length;
    }

    public int getLengthOfString(String input) {

        return input.length();
    }

    public String gethelloReplacedString(String input) {

        return input.replaceAll("hello", "HELLO");
    }

    public String getSpaceReplacedString(String input) {

        return input.replaceAll(" ", ",");
    }

    public String getFirstThreeChars(String input) {

        return input.substring(0, 3);
    }

    public Boolean stringCompare(String s1, String s2) {

        return s1.equals(s2);
    }

    public Boolean palindromeCheck(String s1) {

        char[] s2 = new char[s1.length()];
        for (int i = s1.length() - 1, j = 0; i >= 0; i--, j++) {
            s2[j] = s1.charAt(i);
        }

        String s3 = new String(s2);

        return s3.equals(s1);
    }

    public ArrayList<Integer> getOccurancesOfA(String input) {

        ArrayList<Integer> positions = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                positions.add(i);
            }
        }

        return positions;
    }

    public String modifyInstitute(String input) {

        if (input.contains("institute")) {
            int i = input.indexOf("institute");
            String modified = input.substring(0, i) + "JSS" + input.substring(i + 3);
            return modified;
        }

        return "no institute";

    }

}
