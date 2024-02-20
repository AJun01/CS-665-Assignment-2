package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Shop pandaExpress = new Shop("Panda Express");
//        Shop mcdonald = new Shop("McDonald's");
//
//        //Creating 5 drivers: Tom, Jack, Tracy, Peter, Iverson, they work for two different shops
//        Driver Tom = new Driver("Tomas", pandaExpress);
public class TestUnits {

    public TestUnits(){
    }

    @Test
    public void testGetShopName() {
        Shop shop = new Shop("Chipotle");
        assertEquals("Chipotle", shop.getName());
    }
    @Test
    public void testSetShopName() {
        Shop shop = new Shop("Chipotle");
        shop.setName("ChiChi");
        assertEquals("ChiChi", shop.getName());
    }
    @Test
    public void testMessage() {
        Shop shop = new Shop("Chipotle");
        shop.setDeliveryMessage("yoyo check one two three");
        assertEquals("yoyo check one two three", shop.getDeliveryMessage());
    }
    @Test
    public void testDriver1() {
        Driver driver = new Driver("A", new Shop("a"));
        assertEquals("A", driver.getName());
    }
    @Test
    public void testDriver2() {
        Driver driver = new Driver("B", new Shop("b"));
        assertEquals("B", driver.getName());
    }
    @Test
    public void testDriver3() {
        Driver driver = new Driver("C", new Shop("c"));
        assertEquals("C", driver.getName());
    }
    @Test
    public void testDriver4() {
        Driver driver = new Driver("D", new Shop("d"));
        assertEquals("D", driver.getName());
    }
    @Test
    public void testDriver5() {
        Driver driver = new Driver("E", new Shop("e"));
        assertEquals("E", driver.getName());
    }

    @Test
    public void DeliverRequestTest(){
        Shop shop = new Shop("Haha");
        String message = "Check 1,2,3";
        DeliveryRequest request = new DeliveryRequest(shop, message);
        assertEquals("Check 1,2,3", shop.getDeliveryMessage());
    }
}
