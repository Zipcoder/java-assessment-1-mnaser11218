package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public static Integer countPalindromes(String input){
        int size = input.length();// all single characters in string are treated as palindromes.
        int count = size;
        for(int i=0; i<size; i++) {
            for(int j=i+2; j<=size; j++) {
                String value = input.substring(i, j);
                String reverse = new StringBuilder(value).reverse().toString();
                if(value.equals(reverse)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "aaa";
        System.out.println(
                countPalindromes(str));
    }
}
