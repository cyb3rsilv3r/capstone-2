package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReceiptFileManager {

    public void saveReceipt(Order order) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("receipt.txt"));
            writer.write(order.orderSummary());
            writer.close();
        } catch (IOException e) {
            System.out.println("ur file?...idk bro but it did not save..");
        }
    }



}
