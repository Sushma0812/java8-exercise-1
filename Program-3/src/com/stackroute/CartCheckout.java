package com.stackroute;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CartCheckout {
    public static BigDecimal billGenerator(Map<String, BigDecimal> groceryItems, Double tax) {
        System.out.println(groceryItems)
        //lambda expression to calculate sum of total groceries
        BillGenerate totalPrice = (value, sum) -> sum.add(value);
        BigDecimal sum = new BigDecimal("0");
        BigDecimal result = new BigDecimal("0");
        if ((!groceryItems.isEmpty()) && (tax > 0)) {
            for (BigDecimal value : groceryItems.values()) {
                System.out.println(totalPrice.billGenerate(sum, value));
                return totalPrice.billGenerate(sum,value);
                sum = sum.add(value);
            }
            BigDecimal newTax = new BigDecimal(tax);
            System.out.println(totalPrice.billGenerate(sum, newTax));
            System.out.println(totalPrice);
        }//checks whether the items in the cart is empty or tax is null or negative
        else if (groceryItems.isEmpty() || tax == null || tax < 0) {
            if (groceryItems.isEmpty()) {
                System.out.println("The cart is empty");
            } else if (tax < 0) {
                System.out.println("The taxPercent cannot be negative");
            } else if (tax == null) {
                System.out.println("The taxPercent cannot be null");

            }
        }
        return null;
    }

    public static void main(String[] args) {
        Map<String, BigDecimal> groceryItems = new HashMap<>();
        Scanner reader = new Scanner(System.in);
        //reads size of the map from the user
        System.out.println("Enter grocery items size");
        int size = reader.nextInt();
        //add key value pairs to the map
        for (int i = 0; i < size; i++) {
            String item = reader.next();
            BigDecimal price = reader.nextBigDecimal();
            groceryItems.put(item, price);
        }
        System.out.println("Enter tax percentage");
        //reads tax percentage from user
        Double tax = reader.nextDouble();
        billGenerator(groceryItems, tax);

    }
}
