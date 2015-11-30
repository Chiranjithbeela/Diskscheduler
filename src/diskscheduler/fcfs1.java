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
public class fcfs1 {
    public static void main(String[] args) {
        int n, m, inm, head, st, end;
		//int[] arr = new int[1000];
		//int[] b = new int[1000];
	
		System.out.println("enter start : ");
		//st = scan.nextInt();
                Scanner scan = new Scanner(System.in);    

		st = scan.nextInt();
		System.out.println("enter end : ");
		end = scan.nextInt();
		
		
		
		System.out.println("No of locations to be entered");
		n = scan.nextInt();
		int[] arr = new int[n];
		//int[] b = new int[n];
	
		System.out.println("Give indexes of harddisk ");
		for(int i=0 ;i<n ;i++)
			arr[i] = scan.nextInt();
		System.out.println("enter head ");
		head = scan.nextInt();
                int flag=0;
                for(int h=0;h<n;h++)
                {
                    if(arr[h]==head)
                    {
                        flag=1;
                    }
                }
                if(flag!=1)
                {
                System.out.print(head);
                }//             gfg(n,arr);
                
                   //Try q = new Try();
                   //q.bandla(n, arr);
                for(int k=0;k<n;k++){
            System.out.print(" "+ arr[k]);
                }
      
                
    }
    
}
