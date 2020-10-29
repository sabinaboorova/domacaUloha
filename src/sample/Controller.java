package sample;

import javax.swing.*;
import java.io.*;

public class Controller {
    private JEditorPane myTextFile;

    public void save ()throws IOException {
        FileWriter fileWriter= new FileWriter("dokument", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String nazov =  myTextFile.getText();
        System.out.println(nazov);
        writer.write(nazov);
        writer.close();
    }
    public void initialize() {
        FileReader reader = null;
        try {
            reader = new FileReader("dokument");
            BufferedReader reader1 = new BufferedReader(reader);
            //System.out.println(reader1.readLine());
            String nazov = reader1.readLine();
            myTextFile.setText(nazov);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}


