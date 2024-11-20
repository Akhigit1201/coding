package org.example;

public class ReverseString {
    public static void main(String args[]) {

        String s = "Akhila";


        char[] c = s.toCharArray();

        for (int i = c.length - 1; i >= 0; i--)

            System.out.print(c[i]);

        /*String input = "Akhila";

        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);


        /*String s = "Akhila";
        StringBuffer  sb = new StringBuffer();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);*/
    }
}
