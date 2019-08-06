package com.company;
import java.io.*;
import java.util.ArrayList;

public interface CSV {
    static void WriteToCSVFile() {
        String PathOut = "out.csv";
        ArrayList<Users> users = Application.getUsers();

        try(FileWriter writer = new FileWriter(Pathout, False)) {
            for (User i: users) {
                if (i.getClass().toString().equals("class com.company.Developer")) {
                    writer.write(i.name + ";" + i.number + ";" +  i.id + ";" + ((Developer)i).getLang() + "\n");
                }
                else
                    writer.write(i.name + ";" + i.number + ";" +  i.id + ";" + ((Manager)i).getSales() + "\n");
            }

        }
        writer.flush();
    }
        catch(IOExeption ex) {
        System.out.println(ex.getMessage());
    }
}
