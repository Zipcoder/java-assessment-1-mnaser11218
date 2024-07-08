package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        if(j == k){
            return 1;
        }

        int divide = k /j; // 52 jumps has to check how many 1 jumps now.
        int remainder = k % j;
        return divide + remainder;
    }
}
