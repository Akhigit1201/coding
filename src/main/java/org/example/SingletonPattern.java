package org.example;

public class SingletonPattern {

    public static void main(String args[]){

        SingleObject singleObject= SingleObject.getInstance();

        singleObject.showMessage();

    }
}
