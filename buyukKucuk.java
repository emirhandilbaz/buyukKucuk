/*
ÖDEV

Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız. 
*/

package Java.ikinciKonu.egzersizler;

import java.util.Scanner;

public class buyukKucuk {
    public static void main(String[] args){
        int a, b, c;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("A sayısını giriniz: ");
        a = scan.nextInt();

        System.out.print("B sayısını giriniz: ");
        b = scan.nextInt();

        System.out.print("C sayısını giriniz: ");
        c = scan.nextInt();

        if (a >= b && a >= c){
            if (b > c){
                System.out.print("a > b > c");

            }

            else {
                System.out.print("a > c > b");

            }
         }    

        else if (b >= a && b >= c){
            if (a > c){
                System.out.print("b > a > c");

            }
         
            else {

                System.out.print("b > c > a");

            }

        }    

        else if (c >= a && c >= b){
            if (a > b){
            System.out.print("c > a > b");
            
            }  

            else {
                
                System.out.print("c > b > a");
            }
            
        }

        if (a <= b && a <= c){
            if (b > c){
                System.out.print("a < b < c");

            }

            else {
                System.out.print("a < c < b");

            }
         }    

        else if (b <= a && b <= c){
            if (a > c){
                System.out.print("b < a < c");

            }
         
            else {

                System.out.print("b < c < a");

            }

        }    

        else if (c <= a && c <= b){
            if (a > b){
            System.out.print("c < a < b");
            
            }  

            else {
                
                System.out.print("\nc < b < a");
            }
            
        }
           
    }

}    