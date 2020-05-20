package com.nivtek.corejava.datatypes.strings.lab1;

import java.util.ArrayList;

public class MethodsOfStringDemo {

    public static void main(String[] args) {
        
        MethodsOfString f = new MethodsOfString();
       
        int s = f.getNumberOfWords("HELLO HOW ARE YOU AND WHERE ARE YOU");
        ArrayList l = f.getOccurancesOfA("HELLO HOW ARE YOU AND WHERE ARE YOU");
        Boolean b = f.stringCompare("Hello", "HELLO");
        
        System.out.println(s);

    }

}
