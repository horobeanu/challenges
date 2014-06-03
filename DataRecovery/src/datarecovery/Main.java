package datarecovery;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Your friends decided to make a fun of you. 
 * They've installed a script to your computer which shuffled all of the words within a text. 
 * It was a joke, so they've left hints for each sentence which allow you 
 * to easily rebuild your data. The challenge is to write a program 
 * which reconstructs each sentence out of a set of words, you need 
 * to find out how to use a given hint and print out the original sentences. 
 * Your program should accept as its first argument a path to a filename. 
 * Each line is a test case. Each test case consists of a set of words 
 * and a sequence of numbers separated by a semicolon. 
 * The words within a set and the numbers within a sequence are separated by a single whitespace.
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
                String[] data = currentLine.split(";");
                String[] mixup = data[0].split(" ");
                String[] order = data[1].split(" ");
                int  N = order.length;
                String[] ordered = new String[N+1];
                
                for (int i=0; i < N; i++) {
                    int correctPosition = Integer.parseInt(order[i])-1;
                    ordered[correctPosition] = mixup[i];
                }
                
                for (int i=0; i <= N; i++) {
                    if (ordered[i] != null) {
                        System.out.print(ordered[i]);
                    } else {
                        System.out.print(mixup[N]);
                    }
                       
                    if (i < N) {
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
