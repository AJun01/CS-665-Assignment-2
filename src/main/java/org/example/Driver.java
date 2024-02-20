package org.example;

/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 02/20/2024

 * File Name: Driver.java

 * Description: this is driver class, concrete class of SubscriberBase, implementing SubscriberBase to create drivers

 */

public class Driver implements SubscriberBase{
    private String name;
    private Shop shop;
    private String deliveryMessage;
    /*
     * constructor for Driver, DeliveryMessage is empty string by default, subscribing shop
     */
    public Driver(String name, Shop shop){
        this.name = name;
        this.shop = shop;
        this.deliveryMessage = "";
        this.shop.subscribe(this);
    }
    /*
     * update method: receiving address message, confirming order
     */
    public void updateSelf(String deliveryMessage){
        this.deliveryMessage = deliveryMessage;
        System.out.println("Message received from [" + this.getName() + "] is heading to [" + getDeliveryMessage() + "] with your order");
    }
    /*
     * regular getters
     */
    public String getName(){return this.name;}
    public String getDeliveryMessage(){return this.deliveryMessage;}
}
