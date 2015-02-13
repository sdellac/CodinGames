import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

          byte[] bytes = MESSAGE.getBytes();
String bits = "";
String LetterInBinary = new String();
for (char car : MESSAGE.toCharArray()) {
    LetterInBinary = Integer.toBinaryString(car);
    while (LetterInBinary.length() < 7) {
        LetterInBinary = "0" + LetterInBinary;
}
    bits+=LetterInBinary;
}

System.err.println("message en binaire : " + bits);
//String bits= Integer.toBinaryString('G');
//String bits2= Integer.toBinaryString('G');
//bits+=bits2;
String sortie = new String();

    int i =0;
    while (i<bits.length()) {
        if (bits.charAt(i) == '0') {
            sortie+="00 ";
            while (bits.charAt(i) == '0'){
                sortie+='0';
                i++;
                if (i>=bits.length())
                     break;
            }
            if (i!=bits.length())
                sortie+=' ';
        }
         else {
            sortie+= "0 ";
            while (bits.charAt(i) == '1') {
                sortie+='0';
                i++;
                if (i>=bits.length())
                     break;
                            }
                if (i!=bits.length())
                    sortie+=' ';
           }
    }
            
        


             System.out.println(sortie);


     

    }
}
