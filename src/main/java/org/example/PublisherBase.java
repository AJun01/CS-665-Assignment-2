package org.example;

/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 02/20/2024

 * File Name: PublisherBase.java

 * Description: this is PublisherBase class, interface of publisher class in Observer design pattern

 */
public interface PublisherBase {

    void subscribe(SubscriberBase o);

    void unsubscribe(SubscriberBase o);

    void notifySubscribers();
}