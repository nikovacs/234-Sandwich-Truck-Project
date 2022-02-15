import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private ArrayList<String> makeOrderList() {
        ArrayList<String> orderList = new ArrayList<>();
        orderList.add("Sandwich");
        orderList.add("French Fries");
        orderList.add("Soup");
        return orderList;
    }

    @Test
    public void testRandomTimestamp()
    {
        Order o = new Order("2022-01-01");

    }

    @Test
    public void testRandomOrder()
    {
        ArrayList<String> orderList = makeOrderList();
        Order o = new Order("2022-01-01");
        o.setOrderContents();
        assertTrue(orderList.contains(o.getOrderContents()));
    }

    @Test
    public void testMakingEmptyOrder()
    {
        Order o = new Order("2022-01-01");
        assertTrue(o.getOrderContents().equals(""));

    }

    @Test
    public void testRandomAddress()
    {
        Order o = new Order("2022-01-01");
        o.setRandomAddress();
        System.out.println(o.getAddress());
    }

    @Test
    public void testGetFullOrderDetails()
    {
        Order o = new Order("2022-01-01");
        o.generateRandomFields();
        System.out.println(o.getFullOrderDetails());

    }





}