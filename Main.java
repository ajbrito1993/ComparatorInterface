package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here



        ArrayList<String> arrayList = new ArrayList<String>(2);
        System.out.println("Size of the array: " + arrayList.size());
        arrayList.add("Alex");
        arrayList.add("Nathan");
        System.out.println("Size of the array: " + arrayList.size());

        String name1 = arrayList.get(0);
        String name2 = arrayList.get(1);

        isLarger(name1,name2, new StringComparator());


    }

   static String isLarger (String s1, String s2 , Comparator <String> c) {

        int value = c.compare(s1, s2);
        String firstName = "The first name's length is larger than the second name's length.";
        String secondName = "The second name's length is larger than the first name's length.";
        String same = "The second name's length is the same as the first name's length.";

        if(value == 1) {
            return firstName;
        }

       else if (value == -1){
            return secondName;
        }

        else if (value == 2){
            return same;
        }

        else
            return "Error";
    }

}
