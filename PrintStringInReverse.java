package PrintStringInReverse;

import java.util.Scanner;

public class PrintStringInReverse {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    while(scnr.hasNextLine()){
        String origString = scnr.nextLine();
        String reverseString = "";
        int index = origString.length() - 1;

        while(index >= 0) {
            reverseString += origString.charAt(index);
            index--;
        }
        System.out.println(reverseString);
    }
    scnr.close();
   }
}
