package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class JavaTest {
    public static void main(String[] args) {
        String[] a = new String[]{"skt","huni"};
        ArrayList<String> arrayList = new ArrayList<String>();
        List<String> l = Arrays.asList("1","2");
        l.set(0,"9");
        l.remove(0);
        System.out.println(l);
    }
}
