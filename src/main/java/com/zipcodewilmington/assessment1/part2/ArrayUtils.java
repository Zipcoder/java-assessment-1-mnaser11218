package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for(Object object : objectArray){
            if(object.equals(objectToCount)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Object object : objectArray){
            if(!object.equals(objectToRemove)){
                arrayList.add((Integer) object);
            }

        }
//        return null;
        return arrayList.toArray(new Integer[0]);

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object results = null;
        int mostOccured = 1;
    for(int i = 0; i<objectArray.length; i++){
        int amountOccured = 0;
        for(int j = 0; j <objectArray.length; j++){
            if(objectArray[i].equals(objectArray[j])){
                amountOccured++;
            }
        }
        if(amountOccured > mostOccured){
            results = objectArray[i];
        }
    }
    return results;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object results = null;
        int leastOccured = 1;
        for(int i = 0; i<objectArray.length; i++){
            int amountOccured = 0;
            for(int j = 0; j <objectArray.length; j++){
                if(objectArray[i].equals(objectArray[j])){
                    amountOccured++;
                }
            }
            if(amountOccured <= leastOccured){
                results = objectArray[i];
            }
        }
        return results;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
    // Object []results = new Object[objectArray.length + objectArrayToAdd.length];
       ArrayList<Integer> results = new ArrayList<>();
    int count =0;
    for(int i =0; i< objectArray.length; i++){
        results.add((Integer) objectArray[i]);
        //count++;
    }
    for(int i =0; i<objectArrayToAdd.length; i++){
        results.add((Integer) objectArrayToAdd[i]);
    }
    return results.toArray(new Integer[0]);
          //  results.toArray(new Object[0]);

        //new Integer [map1.size()]
        // return null;
    }
}
