/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskscheduler;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chiranjith Beela
 */
//package Algo;

//import java.util.Arrays;
//import java.util.Scanner;

public class scan {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n, m, inm, head, st, end;
		//int[] arr = new int[1000];
		//int[] b = new int[1000];
	
		System.out.println("enter start : ");
		st = scan.nextInt();
		
		System.out.println("enter end : ");
		end = scan.nextInt();
		
		
		
		System.out.println("No of locations to be entered");
		n = scan.nextInt();
		int[] arr = new int[n];
		int[] b = new int[n];
	
		System.out.println("Give indexes of harddisk ");
		for(int i=0 ;i<n ;i++)
			arr[i] = scan.nextInt();
		System.out.println("enter head ");
		head = scan.nextInt();
		//arr[n] = st;
		//arr[n+1
		Arrays.sort(arr);
                int pos=0,flag=0;
                for (int c = 0; c < n; c++)
                 {
                     if (arr[c] == head)    
                      {
                            flag=1;
                            pos=c;
                            break;
                      }
                 }
                if(flag!=1)
                {
                    /*for(int j=0;j<n;j++)
                    {
                        if(arr[j])
                    }*/
                    for(int j=0; j< n ; j++)
                    {
			//if ((arr[j+1] > head) && (head >= arr[j] ))
                        if(arr[j]>head)
                        {
				//pos = j;
                            break;
                        }
                        pos=j;
                    }
                    
                }
		/*for(int i= 0;i<n; i++)
			System.out.println(arr[i] +" ");*/
                
                System.out.print(head); 
                for(int i=pos; i>=0; i--){
			System.out.print(arr[i] + " ");
                }
                System.out.print(st + " ");
                for(int i=pos+1; i<n; i++){
                	System.out.print(arr[i] + " ");
                 }
                System.out.print(end + " ");
	}
}

