package org.example;


class A{

    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }

}
class C extends A{
    public void show(){
        System.out.println("in C");
    }

}
public class Main {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        B obj1 = new B();
        obj1.show();

        C obj2= new C();
        obj2.show();





    }
}