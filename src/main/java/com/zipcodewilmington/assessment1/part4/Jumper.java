package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        if(j == k){
            return 1; // if k equals j, then only one jump is required.
        }
        // find j jumps amount by dividing k/j
        int divide = k /j;
        //now we need to check how many 1 jumps.
       // check how many 1 jumps by finding the remainder when dividing k and j
        int remainder = k % j;
        // add j amount of jumps to 1 jumps to get total amount of jumps to reach k
        return divide + remainder;
    }
}
