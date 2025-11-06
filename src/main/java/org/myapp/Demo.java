package org.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Demo {

    private static final Logger log = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(" ");
        joiner.add("vikas").add("kumar").add("gupta");
        StringJoiner joiner2 = new StringJoiner("");
        joiner2.add("java").add("developer");

        System.out.println(joiner.merge(joiner2));
    }
}