/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rastgeleogrencisecim;
import java.util.Scanner;
import java.util.Random;
/*there are 300 students with id number that between 2023100 and 2023399.We will select 
n students randomly  */
public class RastgeleOgrenciSecim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        Random x=new Random();
        int number;
        int[] list=new int[n];
        for(int i=0;i<n;i++){
            number=2023100+x.nextInt(300);
            list[i]=number;
            System.out.println((i+1)+".student: "+list[i]);
        }
            
        }        
    }
    

