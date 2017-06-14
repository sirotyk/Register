package entity;

import java.util.LinkedList;
import java.util.Queue;


public class Register implements Runnable {

    private final Cashier cashier;
    private final Queue<Customer> queue = new LinkedList<>();

    public Register(Cashier cashier) {
        this.cashier = cashier;
    }

    public void newCustomer(Customer customer) {
        queue.add(customer);

    }

    public void run() {
        Customer customer;
        int totalTime = 0;
        int numberOfCustomers = 0;
        while ((customer = queue.poll()) != null) {
            totalTime += customer.putGoodsOnTheLine();

            totalTime += cashier.beepTheGoods();

            totalTime += cashier.callAmount();

            totalTime += customer.passMoneyToCashier();

            totalTime += cashier.giveChangeAndReceipt();

            numberOfCustomers++;
        }
        System.out.println ("It was " + numberOfCustomers + " customres" + " and it tooks " + totalTime + " seconds");
    }


}