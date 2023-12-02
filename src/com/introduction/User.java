package com.introduction;

public class User {
    //Fields (attributes
    public String name;

    //Adding constructor: A constructor is the Method that gets called when we create a new instance of the class
    public User(String name, int age){
        this.name=name;
    }
    //Methods
    public void sayHello(){
        System.out.println("Hi, My name is "+name);
    }
}

