package com.nivket.collection.onlineclasspractice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
        int[] ch = {0,2,7,1,2,3,4};
//         Arrays.sort(ch);
         for(int i=0; i< ch.length;i++) {
        	 for(int j=i+1;j<ch.length;j++) {
        		 if(ch[i]+ch[j]==4) {
        			 System.out.println(ch[i]+"   "+ch[j]);

        		 }


        	 }
        	 

        	 
         }
        }
		
		
		
	}


