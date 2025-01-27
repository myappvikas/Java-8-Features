package org.myapp;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        String str = "vikas";
        String reverse = "";
        for (int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("reverse string:"+reverse);

        String str_2 = "gupta";
        System.out.println(new StringBuffer(str_2).reverse().toString());

        String str_3 = "kumar";
        System.out.println(new StringBuilder(str_3).reverse().toString());

        String str_4 = "vikas kumar gupta";
        String[] strArr = str_4.split(" ");
        for (int i = 0; i<strArr.length;i++){
            System.out.print(strArr[strArr.length-i-1]+" ");
        }
        System.out.println();
        String str_5 = "ram";
        String rev =  IntStream.range(0,str_5.length()).mapToObj(i->str_5.charAt(str_5.length()-i-1))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(rev);
    }
}