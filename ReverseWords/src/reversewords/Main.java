package reversewords;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program to reverse the words of an input sentence. 
 * The first argument will be a path to a filename containing multiple sentences, one per line. 
 * Possibly empty lines too. 
 * 
 * @author Daniel Horobeanu <horobeanu@yahoo.com>
 */
public class Main {

    /**
     * @param args[0] String inputFilePath
     */
    public static void main(String[] args) {
        String inputFilePath = args[0];
        InputStreamReader isr;
        try {
            isr = new InputStreamReader(new FileInputStream(inputFilePath));
            BufferedReader br = new BufferedReader(isr);
            String currentLine = "";
            while((currentLine=br.readLine()) != null) {
                if (currentLine.length() == 0) {
                    continue;
                }
                String[] data = currentLine.split(" ");
                int N = data.length-1;
                for (int i=N; i>=0; i--) {
                    System.out.print(data[i]);
                    if (i != 0) {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                    
               
                
            }
            br.close();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

