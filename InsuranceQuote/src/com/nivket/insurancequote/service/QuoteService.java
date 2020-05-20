package com.nivket.insurancequote.service;

import java.util.Arrays;

public class QuoteService {

    public static void main(String args[]) {
      String test = "I am preparing for OCPJP";
      String[] tokens = test.split("\\s");
      System.out.println(Arrays.toString(tokens));
      System.out.println(tokens.length);
    }
  }