package com.stackroute;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;
public class AlphabetChecker {
    public static String checkAlphabets(List<String> list) {
        String result = " ";
        System.out.println(list);
        //if list is empty displays give proper input
        if (list.isEmpty()) {
            result = "Give proper input not empty list";
        }
        //if list contains string checks whether string is of only alphabets or not
        else {
            AlphabetCheckInterface lambdaExpressionOne = (string) -> (string != null);
            AlphabetCheckInterface lambdaExpressionTwo = (string) -> (string != " ");
            AlphabetCheckInterface lambdaExpressionThree = (string) -> string.chars().allMatch(Character::isLetter);
            for (String string : list) {
                if (lambdaExpressionOne.checkAlphabet(string) && lambdaExpressionTwo.checkAlphabet(string) && lambdaExpressionThree.checkAlphabet(string)) {
                    result = "Given list contains only alphabet strings";
                }
                //if list contains alphanumeric it displays list contains not alphabet strings
                else {
                    result = "Given list contains non alphabet strings";
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter list size");
        int listSize = reader.nextInt();
        //reads elements from the user
        for (int i = 0; i < listSize; i++) {
            String names = reader.next();
            arrayList.add(names);
        }
        String result = checkAlphabets(arrayList);
        System.out.println(result);
    }
}
