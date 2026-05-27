package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptFileManager {

    public void saveReceipt(Order order) throws IOException {
        //make a folder for the receipts
        File folder = new File("reciepts.txt");
        folder.mkdirs();

        // add a date time formatter then make time stamp file name
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = LocalDateTime.now().format(formatter) + ".txt";

        // make a receipts file in the folder
        File receiptFile = new File(folder, fileName);
        try {
            //write the summary into the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("receipt.txt"));
            writer.write(order.orderSummary());
            writer.close();
            System.out.println("Ur receipt was saved !");
        } catch (IOException e) {
            System.out.println("ur file?...idk bro but it did not save..");
        }
    }



}
