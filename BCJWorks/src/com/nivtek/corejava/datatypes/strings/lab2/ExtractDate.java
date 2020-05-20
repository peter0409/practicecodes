/**
 * 
 */
package com.nivtek.corejava.datatypes.strings.lab2;

/**
 * @author Bootcamp User 017
 *
 */
public class ExtractDate {
    
    public void getIndividualDateElements(String date) {
        
        String[] elements = date.split("/");
        String month = elements[0];
        String day = elements[1];
        String year = elements[2];
    }

}
