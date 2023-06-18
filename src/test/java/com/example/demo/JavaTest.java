package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class JavaTest {
    public static void main(String[] args) {
        String[] a = new String[]{"skt","huni"};
        ArrayList<String> arrayList = new ArrayList<String>();
        List<String> l = Arrays.asList("1","2");
        l.set(0,"9");
        System.out.println(JavaTest.class);
        Optional<String> opT = Optional.empty();
        System.out.println(opT.map(s->s+"1"));
    }
}
