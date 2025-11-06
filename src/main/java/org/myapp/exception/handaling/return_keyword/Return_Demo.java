package org.myapp.exception.handaling.return_keyword;

public class Return_Demo {

    public static void main(String[] args) {

        int value = division();
        System.out.println(value);
    }

    public static int division(){
        try {
            int a = 50/0;
            System.out.println("try-block");
            return 1;
        }catch (Exception ex){
            System.out.println("catch-block");
            return 2;
        }finally {
            System.out.println("finally-block");
            return 3;
        }
    }
}
