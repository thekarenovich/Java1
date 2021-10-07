package com.company;

public class Main{
    public static void main(String[] args){

        System.out.print("hahaha");

        Author obj = new Author("Erik", "erik.khachatryan.00.00@mail.ru", 'm');

        System.out.print(obj.getName());
        System.out.print(obj.getEmail());
        System.out.print(obj.getGender());

    }
}

class Author{

    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){

        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    String getName(){ return  name; }

    void setEmail(){ this.email = email; }

    String getEmail(){ return email; }

    char getGender(){ return gender; }


    //String toString(){ ... }


}


