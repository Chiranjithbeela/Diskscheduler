/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskscheduler;

import java.util.Scanner;

/**
 *
 * @author Chiranjith Beela
 */
public class optimalpage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("eNter no of pages");
        n=scan.nextInt();
        int a[]=new int[n];
        System.out.println("enter pages");
        for (int i=0;i<n;i++)        
        {
            a[i]=scan.nextInt();
            
        }
        
        
    }
    
}
