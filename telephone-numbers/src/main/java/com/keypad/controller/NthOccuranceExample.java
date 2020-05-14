package com.keypad.controller;

public class NthOccuranceExample {
	public static void main(String[] args) {
        String str1 = "helloworld good morning good evening good night";
        String str2 = "good";
        int n = 2;
 
        int index = nthOccurrence(str1, str2, n);
        System.out.println("index of str2 in str1 at occurrence "+ n +" = "+ index);
    }
 
    public static int nthOccurrence(String str1, String str2, int n) {
 
        String tempStr = str1;
        int tempIndex = -1;
        int finalIndex = 0;
        
        for(int occurrence = 0; occurrence < n ; ++occurrence){
            tempIndex = tempStr.indexOf(str2);
            if(tempIndex==-1){
                finalIndex = 0;
                break;
            }
            tempStr = tempStr.substring(++tempIndex);
            finalIndex+=tempIndex;
        }
        return --finalIndex;
    }
}
