package act9;

import java.util.*;

public class act9 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the total no of votes : ");
	    int N=sc.nextInt();
	    //since 55% of valid votes got for one member hence 45% got for other member.
	    int othermem_votes = (N*80*45)/(100*100);
	    System.out.print("The number of valid votes for other candidate are : "+othermem_votes);
	}
}