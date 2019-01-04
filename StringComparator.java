package com.company;

import java.awt.peer.CanvasPeer;
import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        int length1 = o1.length();
        int length2 = o2.length();

        if (length1 < length2){
            System.out.println("The first name's length is smaller than the second name's length.");
            return 1;
        }

        else if (length2 > length1) {
            System.out.println("The second name's length is larger than the first name's length.");
            return 0;
        }

        else  if (length1 == length2) {
            System.out.println("The lengths match size");
            return 2;
        }

        return -1;

    }
}

