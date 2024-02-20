package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 02/20/2024

 * File Name: Main.java

 * Description: this is the main class, calling Shop and Driver created 5 drivers and 2 shops

 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //creating 2 shops: McDonald and PandaExpress
        Shop pandaExpress = new Shop("Panda Express");
        Shop mcdonald = new Shop("McDonald's");

        //Creating 5 drivers: Tom, Jack, Tracy, Peter, Iverson, they work for two different shops
        Driver Tom = new Driver("Tomas", pandaExpress);
        Driver Jack = new Driver("Jackson", mcdonald);
        Driver Tracy = new Driver("Tracia", pandaExpress);
        Driver Peter = new Driver("Peterson", mcdonald);
        Driver Iverson = new Driver("Iversonic", mcdonald);

        //a hashmap storing keywords for user conversation
        Map<String, Shop> shops = new HashMap<>();
        shops.put("panda", pandaExpress);
        shops.put("mcd", mcdonald);

        //scanner for capture user input
        Scanner scanner = new Scanner(System.in);

        //first question asking for a shop
        System.out.println("For what store you want to make an order?");
        String shop = scanner.nextLine();
        Shop shop1 = shops.get(shop);

        //second question asking for a message(address)
        System.out.println("What is your address?");
        String message = scanner.nextLine();

        //third question(trivia question only make system look good ;P) asking what they want for food
        System.out.println("Okie, What do you want?");
        String food = scanner.nextLine();

        //key feature* pretend processing time ;P
        Thread.sleep(1000);
        System.out.println("Making Order...");
        Thread.sleep(1000);
        System.out.println("Making Order...");
        Thread.sleep(1000);
        System.out.println("Making Order...");
        Thread.sleep(1000);

        //push the request message to DeliveryRequest
        DeliveryRequest request = new DeliveryRequest(shop1, message);
    }
}