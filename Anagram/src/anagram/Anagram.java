package anagram;

import java.io.*;
import java.util.*;

/**
 * Alice recently started learning about cryptography and found that anagrams are very useful. 
 * Two strings are anagrams of each other if they have same character set (and frequency of characters) and same length. 
 * For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.
 * 
 * Alice decides on an encryption scheme involving 2 large strings where 
 * encryption is dependent on the minimum number of character deletions 
 * required to make the two strings anagrams. 
 * She need your help in finding out this number.
 * 
 * Given two strings (they can be of same or different length) help her 
 * in finding out the minimum number of character deletions required to make 
 * two strings anagrams. Any characters can be deleted from any of the strings. 
 * 
 * Input Format
 * Two lines each containing a string. 
 * 
 * Output Format
 * A single integer which is the number of character deletions. 
 * 
 * Sample Input
 * cde
 * abc
 * Sample Output
 * 4
 * 
 * @author Daniel Horobeanu <horobeanu@yahoo.com>
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        char[] firstWordArray = scanner.nextLine().toCharArray();
        char[] secondWordArray = scanner.nextLine().toCharArray();
        
        // convert Array in List in order to easly remove elements
        //@TODO : find the best way to do that
        List<Character> secondWordList = new ArrayList<>();
        for(char ch : secondWordArray){
            secondWordList.add(ch);
        }

        int nrOfCharsToDelete = 0;
        for (int i=0; i< firstWordArray.length; i++) {
            char charFromFirst = firstWordArray[i];
            boolean charFound = false;
            for (int j=0; j< secondWordList.size(); j++) {
                char charFromSecond = secondWordList.get(j);
                if (charFromFirst == charFromSecond) {
                    secondWordList.remove(j);
                    charFound = true;
                    break;
                }
            }
            if (!charFound) {
                nrOfCharsToDelete++;
            }
        }
        
        nrOfCharsToDelete = nrOfCharsToDelete + secondWordList.size();
        
        System.out.println(nrOfCharsToDelete);
    }
    
}
