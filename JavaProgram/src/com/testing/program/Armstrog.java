package com.testing.program;

import java.util.Scanner;

public class Armstrog {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        sc.close();
        String[] str=s.split("");
       int sum=0;
       for(int i=0;  i<str.length; i++){
    	   int a=Integer.parseInt(str[i]);
    	   sum= sum +a*a*a;
       }
       System.out.println(s);
       if(sum==Integer.parseInt(s)){
    	   System.out.println("its Armstrog");
       }else{
    	   
    	   System.out.println("its not Armstrog");
       }
	}

}
