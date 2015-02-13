import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        int posX, posY;
        posX = TX;
        posY = TY;
int dX = LX-posX;
int dY = LY-posY;
        // game loop
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            //if (TX != LX && TY != LY) {


                    if (dX>0 && dY>0) {
                        System.out.println("SE");
                        posX++; posY++;
                        dX = LX-posX; dY=LY-posY;
                         }
                    if (dX>0 && dY==0) {
                        System.out.println("E");
                         posX++; 
                         dX = LX-posX;
                        }
                    if (dX>0 && dY<0) {
                        System.out.println("NE");
                         posX ++; posY--;
                         dX = LX-posX; dY=LY-posY;
                        }
                    if (dX<0 && dY>0) {
                        System.err.println("posy" + posY);
                        System.out.println("SW"); 
                         posX --; posY++;
                         dX = LX-posX; dY=LY-posY;
                        }
                    if (dX<0 && dY==0) {
                        System.out.println("W");
                         posX --; 
                         dX = LX-posX;
                        }
                    if (dX<0 && dY<0) {
                        System.out.println("NW");
                         posX --; posY--;
                         dX = LX-posX; dY=LY-posY;
                        }
                    if (dX==0 && dY<0) {
                        System.out.println("N");
                         posY--;
                        dY=LY-posY;     
                    }
                    if (dX==0 && dY>0) {
                        System.out.println("S");
                        posY++;
                        dY=LY-posY;
                    }
                    
        //    } // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}
