package org.myapp.core.java.immutable;

final class Demo {

    private int i = 10;

    public Demo(int i){
        this.i=i;
    }

    public Demo modifyIt(int i){
        if(this.i == i)
            return this;
        else
            return new Demo(i);
    }

    public static void main(String[] args) {

        Demo d1 = new Demo(10);
        Demo d2 = d1.modifyIt(10);
        System.out.println(d1.equals(d2));

        Demo d3 = new Demo(10);
        Demo d4 = d1.modifyIt(100);
        System.out.println(d3.equals(d4));

    }
}
