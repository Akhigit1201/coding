package org.example;

public class SingleObject {

    private static SingleObject object= new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return object;
    }
    public void showMessage(){
        System.out.println("Hello world");
    }
}
