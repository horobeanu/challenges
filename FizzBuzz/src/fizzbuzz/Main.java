package fizzbuzz;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple game involving divisibility tests.
 * Your program should read an input file (provided on the command line) 
 * which contains multiple newline separated lines.
 * Each line will contain 3 numbers which are space delimited. 
 * The first number is first number to divide by ('A' in this example), 
 * the second number is the second number to divide by ('B' in this example) 
 * and the third number is where you should count till ('N' in this example). 
 * You may assume that the input file is formatted correctly 
 * and is the numbers are valid positive integers.
 * Print out the series 1 through N replacing numbers divisible by 'A' by F, 
 * numbers divisible by 'B' by B and numbers divisible by both as 'FB'. 
 * Since the input file contains multiple sets of values, your output will print out one line per set. 
 * Ensure that there are no trailing empty spaces on each line you print.
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
                String[] data = currentLine.split(" ");
                int  A = Integer.parseInt(data[0]);
                int  B = Integer.parseInt(data[1]);
                int  N = Integer.parseInt(data[2]);
                
                for (int i=1; i <=N; i++) {
                    boolean set = false;
                    if (i % A == 0) {
                        System.out.print("F");
                        set = true;
                    }
                    if (i % B == 0) {
                        System.out.print("B");
                        set = true;
                    }
                    if ( ! set ) {
                        System.out.print(i);
                    }
                    if (i < N) {
                        System.out.print(" ");
                    } else {
                        System.out.println("");
                    }
                }
            }
            br.close();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
