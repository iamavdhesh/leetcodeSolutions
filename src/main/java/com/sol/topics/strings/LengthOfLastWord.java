package com.sol.topics.strings;

//TODO Refactor the code to improve readability and remove unnecessary print statements

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        
        String[] arrStr=s.split(" ");
        System.out.println(arrStr.length);
        for (String string : arrStr) {
            System.out.println(" XXXX : "+string);
        }
        if(arrStr.length>0)
           return arrStr[arrStr.length-1].length();
        return 0;   


    }
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
        String testString = "      Hello World    how     ";
        int length = solution.lengthOfLastWord(testString);
        System.out.println("Length of last word: " + length); // Output: 5
    }
}