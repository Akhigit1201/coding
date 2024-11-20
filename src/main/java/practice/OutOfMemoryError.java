package practice;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {

    public static void main(String[] args) {

        try{
            int[] array = new int[Integer.MAX_VALUE];

        }catch (java.lang.OutOfMemoryError error){

            System.out.println("Out of memory error occurred: " +error);

        }
    }
}
