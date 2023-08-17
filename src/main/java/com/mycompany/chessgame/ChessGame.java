/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chessgame;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class ChessGame {

    public static void main(String[] args) {
        System.out.println("Hello welcome to chess game");
       // System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        // String inputString = scanner.nextLine();
      //   System.out.println(inputString);
        /* System.out.println("Enter your age");
         int number1 = scanner.nextInt();
         System.out.println(number1 );*/
             String[][] matriz = {
            {"1","|","X", "B", "C", "D", "E", "F", "G", "H"},
            {"2","|","X", "J", "K", "L", "M", "N", "O", "P"},
            {"3","|","X", "R", "S", "T", "U", "V", "W", "X"},
            {"4","|","X", "Z", "A", "B", "C", "D", "E", "F"},
            {"5","|","X", "H", "I", "J", "K", "L", "M", "N"},
            {"6","|","X", "P", "Q", "R", "S", "T", "U", "V"},
            {"7","|","P1", "X", "Y", "Z", "A", "B", "C", "D"},
            {"8","|","E", "F", "G", "H", "I", "J", "K", "L"},
            {" "," ","-", "-", "-", "-", "-", "-", "-", "-"},
            {" "," ","1", "2", "3", "4", "5", "6", "7", "8"}
            };
         
             
             
             
         displaytab(matriz);
    
        System.out.println("Enter line");
         int numberL = scanner.nextInt();
         System.out.println("Enter colun");
         int numberC = scanner.nextInt();
        System.out.println(matriz[numberL][numberC]);
        System.out.println("move to line");
        int numberNL = scanner.nextInt();
        System.out.println("move to colun");
        int numberNC = scanner.nextInt();
        int return1 = CheckLine(numberNL);
        int returnC = CheckColu(numberNC);
        if(return1 == 10 && returnC == 10 ){
        System.out.println("movment allowed");
        String test5 = Movements(matriz[numberNL][numberNC]);
        System.out.println(test5);

        }
        else {
            System.out.println("movement not allowed");
        }
        
        System.out.println(return1);
        System.out.println("teste");

        displaytab(matriz);

    }
    
    
    
     public static void displaytab(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
     
     
     public static int CheckLine(int line1){
        int i;
         if(line1 <= 7 && line1>=0){
          i = 10;}
         else { 
             i=0;}
       return i;
        }
     
     
      public static int CheckColu(int colu1){
        int i;
         if(colu1 <= 9 && colu1>=2){
          i = 10;}
         else { 
             i=0;}
       return i;
        }
      
      
        public static int MovePawn(int OldLine, int OldColu, int NewLine, int NewColu){
        int np = 0;
            int test = OldColu - NewColu;
        int test2 = OldLine - NewLine;
        int res = (test + test2)*(-1);
        if(res == 1){
            return res;}
        else   {
            return np;}
            
        }
        
     public static String Movements(String piece){
        String fullDayName;
        fullDayName = piece;
         return piece;
     
     }
     
     
     
     
}
