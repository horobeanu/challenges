package sequencetransformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * There are two sequences. The first sequence consists of digits "0" and "1", 
 * the second one consists of letters "A" and "B". The challenge is to determine 
 * whether it's possible to transform a given binary sequence into a string sequence 
 * using the following rules:
 * 1. "0" can be transformed into non empty sequence of letters "A" ("A", "AA", "AAA" etc.)
 * 2. "1" can be transformed into non empty sequence of letters "A" ("A", "AA", "AAA" etc.) 
 *                          or to non empty sequence of letters "B" ("B", "BB", "BBB" etc)
 * For each test case print out "Yes" if the transformation is possible, otherwise print "No".
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
                String digits = data[0];
                String letters = data[1];
                
//                int  N = digit.length;
                
                
//                for (int i=0; i < N; i++) {
//                    int correctPosition = Integer.parseInt(order[i])-1;
//                    ordered[correctPosition] = mixup[i];
//                }
//                
//                for (int i=0; i <= N; i++) {
//                    if (ordered[i] != null) {
//                        System.out.print(ordered[i]);
//                    } else {
//                        System.out.print(mixup[N]);
//                    }
//                       
//                    if (i < N) {
//                        System.out.print(" ");
//                    }
//                }
                System.out.println("");
            }
            br.close();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

