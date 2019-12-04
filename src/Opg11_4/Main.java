package Opg11_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);

        for (int i = 0; i < 10 ; i++) {
            int random = (int)(Math.random()*10+1);
            numbers.add(random);
        }

        System.out.println(max(numbers));




    }
    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0)
            return null;
        else
            return Collections.max(list);
    }
}

