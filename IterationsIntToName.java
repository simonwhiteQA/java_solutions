package com.qa.community;

public class IterationsIntToName {
	
    public static void main(String[] args) {
        System.out.println(numToWord(80));
        System.out.println(numToWord(95));
        System.out.println(numToWord(5011));
        System.out.println(numToWord(6999));
        System.out.println(numToWord(803));
        System.out.println(numToWord(7777));
        System.out.println(numToWord(10000));
        numbersRevisited(1, 100);
    } 
    
    
    public static int[] numberToIntArray(int val1) {
        //Parse integer value into array with separate int values
        String[] parts = Integer.toString(val1).split("(?!^)");
        int[] num = new int[parts.length];
        int i = 0;
        for(String p : parts) {
            try {
                num[i] = Integer.parseInt(p);
                i++;
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
        num = reverseArray(num);
        return num;
    }
    
    public static int[] reverseArray(int[] numberArray) {
        for(int i = 0; i < numberArray.length / 2; i++) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - i - 1];
            numberArray[numberArray.length - i - 1] = temp;
        }
        return numberArray;
    }
    
    public static String numToWord(int num) {
        int[] number = numberToIntArray(num);
        String numWord = "";
        if(num == 0) {
            return "zero";    
        }else {
            for(int i = number.length-1; i >= 0; i--) {
                int nextNumber = 0;
                if (i == 1 && number[i] == 1) {
                    nextNumber = number[i - 1];
                    numWord = numWord + " " + assignWord(number[i], i, nextNumber);
                    i--;
                } else {
                    numWord = numWord + " " + assignWord(number[i], i, nextNumber);
                }
                
            }
        }
        numWord = numWord.trim().replaceAll("  ", " ");
        return numWord;
    }
    
    public static void numbersRevisited(int startNumber, int endNumber) {
        if(startNumber < endNumber) {
            for(int i = startNumber; i <= endNumber; i++) {
                System.out.println(numToWord(i));
            }
        }
    }
    
    public static String assignWord(int num, int length, int nextNumber) {
        switch(num) {
        case 0: return "";
        case 1: 
            switch(length) {
            case 0: return "one";
            case 1: 
                switch(nextNumber) {
                case 0: return "ten";
                case 1: return "eleven";
                case 2: return "twelve";
                case 3: return "thirteen";
                case 4: return "fourteen";
                case 5: return "fifteen";
                case 6: return "sixteen";
                case 7: return "seventeen";
                case 8: return "eighteen";
                case 9: return "nineteen";    
                }
            case 2: return "one hundred";
            case 3: return "one thousand";
            }
        case 2: 
            switch(length) {
            case 0: return "two";
            case 1: return "twenty";
            case 2: return "two hundred";
            case 3: return "two thousand";
            }
        case 3: 
            switch(length) {
            case 0: return "three";
            case 1: return "thirty";
            case 2: return "three hundred";
            case 3: return "three thousand";
            }
        case 4: 
            switch(length) {
            case 0: return "four";
            case 1: return "fourty";
            case 2: return "four hundred";
            case 3: return "four thousand";
            }
        case 5: 
            switch(length) {
            case 0: return "five";
            case 1: return "fifty";
            case 2: return "five hundred";
            case 3: return "five thousand";
            }
        case 6: 
            switch(length) {
            case 0: return "six";
            case 1: return "sixty";
            case 2: return "six hundred";
            case 3: return "six thousand";
            }
        case 7: 
            switch(length) {
            case 0: return "seven";
            case 1: return "seventy";
            case 2: return "seven hundred";
            case 3: return "seven thousand";
            }
        case 8: 
            switch(length) {
            case 0: return "eight";
            case 1: return "eighty";
            case 2: return "eight hundred";
            case 3: return "eight thousand";
            }
        case 9: 
            switch(length) {
            case 0: return "nine";
            case 1: return "ninety";
            case 2: return "nine hundred";
            case 3: return "nine thousand";
            }
        default: return "invalid num";
        }
    }
}
