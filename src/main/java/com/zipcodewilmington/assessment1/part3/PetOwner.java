package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
   //private Pet[] pets = new Pet[];
    public Pet[] pets;

//    public PetOwner() {
//    }


    public PetOwner(String name, Pet... pets) {
        this.name =name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        Pet newarr[];
        int count;
        if(this.pets == null){
            newarr = new Pet[1];
            count =0;
        }else{
            newarr = new Pet[pets.length + 1];
            count = pets.length;
        }


        for (int i = 0; i < count; i++){
            newarr[i] = pets[i];
        }
        newarr[count] = pet;


        this.pets = newarr;

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet newarr[] = null;
        int count;
        if(this.pets.length == 1){
           this.pets[0] = null;

        }else{
            newarr = new Pet[pets.length -1];
            count = pets.length;
            for (int i = 0; i < count; i++){
                if(!pets[i].equals(pet)){
                    newarr[i] = pets[i];
                }

            }

            this.pets = newarr;

        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        for (int i = 0; i < this.pets.length; i++){
            if(pets[i].equals(pet)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        Integer youngestAge = 100;
        for(int i =0; i< this.pets.length; i++){
            if(pets[i].getAge() <= youngestAge){
                youngestAge = pets[i].getAge();
            }
        }
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer youngestAge = 0;
        for(int i =0; i< this.pets.length; i++){
            if(pets[i].getAge() >= youngestAge){
                youngestAge = pets[i].getAge();
            }
        }
        return youngestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float averagePetAge = 0.0F;

        for(int i =0; i< this.pets.length; i++){
                averagePetAge += pets[i].getAge();

        }
        return averagePetAge / this.pets.length;



    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return this.pets;
    }
}
