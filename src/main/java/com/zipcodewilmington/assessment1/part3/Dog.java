package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     *
     */
    private String name="";
    private Integer age =0;
    //private PetOwner owner;

//    @Override
//    public PetOwner getOwner() {
//        return this.owner;
//    }
//
//    @Override
//    public void setOwner(PetOwner owner) {
//        this.owner = owner;
//    }

    public Dog(String name, Integer age) {
//super(name, age);
        this.name =name;
        this.age =age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
       this.age = age;
       this.name = "Dog name";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
       this.name =name;
       this.age =this.age;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.name = "Dog name";
        this.age = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
