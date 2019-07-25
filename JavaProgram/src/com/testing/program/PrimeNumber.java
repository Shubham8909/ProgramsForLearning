package com.testing.program;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		   int iTsprime=sc.nextInt();
		   boolean flag=false;
		   while(iTsprime!=0){
		   if(iTsprime==1 || iTsprime==0){
			   System.out.println("Not a prime number");
		   }else{
			   ;
			   for(int i=2; i<=iTsprime/2; i++){
				   int temp= iTsprime%i;
				  if(temp==0){
					  flag=true;
				  }
			   }
			   if(flag){
				   System.out.println("Not a prime number");
			   }else{
				   System.out.println(" its a prime number");
			   }
			   flag=false;
			   
		   }
		   iTsprime=sc.nextInt();
		   }
		   sc.close();
	}

}
