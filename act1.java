package act1;

import java.io.*;
import java.util.Scanner;
public class activity1 {
public static void main(String[] args) {
int i,n=5;
Scanner sc=new Scanner(System.in);
int Array[];   
Array = new int[n];
		for(i=0;i<n;i++)
		{
		Array[i]=sc.nextInt();	
		}
   int max = Array[0];
        for (i = 1; i < n; i++){
            if (Array[i] > max)
                max = Array[i];
       
	}
System.out.println(max);
}
}