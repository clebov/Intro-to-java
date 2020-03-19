/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmas;

/**
 *
 * @author clebo
 */
public class Xmas {

    public static void main(String[] args) {
        
        int day = 1;
        
        while (day != 13){
            
            
            switch(day){
                case 12:
                    System.out.print("On the Twelfth day of Christmas \nmy true love sent to me:\n");
                    break;
                case 11:
                    System.out.print("On the Eleventh day of Christmas \nmy true love sent to me:\n");
                    break;
                case 10:
                    System.out.print("On the Tenth day of Christmas \nmy true love sent to me:\n");
                    break;
                case 9:
                    System.out.print("On the Ninth day of Christmas \nmy true love sent to me:\n");
                    break;
                case 8:
                    System.out.print("On the Eighth day of Christmas \nmy true love sent to me:\n");
                    break;
                case 7:
                    System.out.print("On the Seventh day of Christmas \nmy true love sent to me:\n");
                    break;
                case 6:
                    System.out.print("On the Sixth day of Christmas \nmy true love sent to me:\n");
                    break;
                case 5:
                    System.out.print("On the Fifth day of Christmas \nmy true love sent to me:\n");
                    break;
                case 4:
                    System.out.print("On the Fourth day of Christmas \nmy true love sent to me:\n");
                    break;
                case 3:
                    System.out.print("On the Third day of Christmas \nmy true love sent to me:\n");
                    break;
                case 2:
                    System.out.print("On the Second day of Christmas \nmy true love sent to me:\n");
                    break;
                case 1:
                    System.out.print("On the First day of Christmas \nmy true love sent to me:\n");
                    break;
            }
            
           switch(day){
               case 12:
                   System.out.println("12 Drummers Drumming");
               case 11:
                   System.out.println("11 Pipers Piping");
               case 10:
                   System.out.println("10 Lords a Leaping");
               case 9:
                   System.out.println("9 Ladies a Dancing");
               case 8:
                   System.out.println("8 Maids a Milking");
               case 7:
                   System.out.println("7 Swans a Swimming");
               case 6:
                   System.out.println("6 Geese a Laying");
               case 5:
                   System.out.println("5 Golden Rings");
               case 4:
                   System.out.println("4 Calling Birds");
               case 3:
                   System.out.println("3 French Hens");
               case 2:
                   System.out.println("2 Turtle Doves");
               case 1:
                   if (day > 1) System.out.print("and ");
                   System.out.println("a Partridge in a Pear Tree");
                   
              
           }
           
           day++;
           System.out.println();
           
           
           
        }
    }
    
}
