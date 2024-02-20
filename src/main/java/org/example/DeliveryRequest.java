package org.example;

/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 02/20/2024

 * File Name: DeliveryRequest.java

 * Description: this is DeliveryRequest class, handling message pushing.

 */
public class DeliveryRequest {
    public DeliveryRequest(Shop shop, String message){
        shop.setDeliveryMessage(message);
    }

}
