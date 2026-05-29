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
        File folder = new File("receipts");
        folder.mkdirs();

        // add a date time formatter then make time stamp file name
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = LocalDateTime.now().format(formatter) + ".txt";

        // make a receipts file in the folder
        File receiptFile = new File(folder, fileName);
        try {
            //write the summary into the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile));
            writer.write(order.orderSummary());

            System.out.println("Ur receipt was saved !");
            System.out.println(" order no: "+ receiptFile.getPath());
        } catch (IOException e) {
            System.out.println("ur file?...idk but it did not save..");
        }
    }



}
