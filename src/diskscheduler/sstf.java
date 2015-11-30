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
public class sstf {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
		int n, m, inm, head, st, end;
		System.out.println("enter start : ");
		st = scan.nextInt();
		System.out.println("enter end : ");
		end = scan.nextInt();
		System.out.println("No of locations to be entered");
		n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Give indexes of harddisk ");
		for(int i=0 ;i<n ;i++)
			arr[i] = scan.nextInt();
		System.out.println("enter head ");
		head = scan.nextInt();
		Arrays.sort(arr);
                int pos=0,flag=0;
                for (int c = 0; c < n; c++)
                 {
                     if (arr[c] == head)    
                      {
                            System.out.println(head + " is present at location " + (c + 1));
                            flag=1;
                            pos=c;
                            break;
                      }
                 }
                /*if(flag!=1)
                {     
                    for(int j=0; j< n ; j++)
                    {
                        if(arr[j]>head)
                        {
                            break;
                        }
                        pos=j;
                    }
                }*/
                if(flag!=1)
                {
                    for(m=0;m<(n-1);m++)
                    {
                        if(arr[m+1]>head && arr[m]<head)
                        {
                            if((arr[m+1]-head)>(head-arr[m]))
                            {
                                pos=m;
                            }
                            else{
                                pos=m+1;
                            }
                            break;
                        }
                    }
                }
                System.out.print(head + " ");
                int k=0,a=0,l=0,p=0,i=0;
                a=pos-1;
                l=pos+1;
                k=pos;
                if(arr[pos]!=head){
                    
                
                        System.out.print(arr[pos]+ " ");
                }
                while(a>=0 || l<n)
                {
                    p=0;
                    i=0;
                    if(a>=0){
                         p=arr[k]-arr[a];
                    }
                    if(l<n){
                        i=arr[l]-arr[k];
                    }
                    if(p>i || a<0)
                    {
                       System.out.print(arr[l]+" "); 
                       //k++;
                       k=l;
                       l++;
                    }
                    else if(p<=i || l>=n){
                        System.out.print(arr[a]+" ");
                        //k--;
                        k=a;
                        a--;
                    }      
                }           
    }
}