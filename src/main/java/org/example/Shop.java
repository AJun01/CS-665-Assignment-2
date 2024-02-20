package org.example;

import java.util.ArrayList;
import java.util.Random;

/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 02/20/2024

 * File Name: Shop.java

 * Description: this is Shop class, concrete class of PublisherBase, contains the behavior of creating shops

 */
public class Shop implements PublisherBase{
    private String name;
    private String deliveryMessage;
    private ArrayList<SubscriberBase> drivers = new ArrayList<>();
    /*
     * constructor for Shop, setDeliveryMessage is empty string by default
     */
    public Shop(String name){
        this.name = name;
        this.setDeliveryMessage("");
    }
    /*
     * regular getters
     */
    String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    String getDeliveryMessage(){return this.deliveryMessage;}
    /*
     * important method that takes one argument as message & call notify() to passing this message to the driver
     */
    public void setDeliveryMessage(String message){
        this.deliveryMessage = message;
        notifySubscribers();}
    /*
     * Add subscriber to the Arraylist of subscribers
     */
    public void subscribe(SubscriberBase o){drivers.add(o);}
    /*
     * Remove subscriber to the Arraylist of subscribers
     */
    public void unsubscribe(SubscriberBase o){drivers.remove(o);}
    /*
     * notify drivers of the message location
     */
    public void notifySubscribers(){
        //check if the arraylist is positive
        if (drivers.size() > 0) {
            //using random to get a number from driver arraylist size
            Random random = new Random();
            int index = random.nextInt(drivers.size());
            //pick a random available driver from the arraylist to deliver the order
            SubscriberBase randomSubscriber = drivers.get(index);
            //notify that randomly picked driver
            randomSubscriber.updateSelf(this.deliveryMessage);
        }
    }
}
