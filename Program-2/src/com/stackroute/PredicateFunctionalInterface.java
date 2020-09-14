package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PredicateFunctionalInterface {
    public static String findPattern(List<String> list){
        System.out.println(list);
        //if list is empty displays give proper input
        if (list.isEmpty()) {
            System.out.println("Give proper input not empty list");
        }
        //if list contains string checks whether string is of only alphabets or not
        else {
            Predicate<String> startsWithI = (string) -> string.startsWith("I");
            ArrayList<String> arrayListStartsWithI = new ArrayList<String>();
            for (String string : list) {
                if(startsWithI.testdata(string)){
                    arrayListStartsWithI.add(string);
                }
            }
            System.out.println(arrayListStartsWithI);
        }
        return null;
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter size of the list");
        int listSize = reader.nextInt();
        //reads elements from the user
        for (int i = 0; i < listSize; i++) {
            String names = reader.next();
            arrayList.add(names);
        }
        findPattern(arrayList);
    }
}

