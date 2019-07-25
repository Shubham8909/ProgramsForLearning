package com.testing.program;

public class LeastSimilarValue {
	
	public static void main(String[] args) {
		int i=11;
		int sum=i;
	
		while(true){
			int x=0;
			int sum1=0;
			sum=sum+i;
			System.out.println(sum);
		    int check=sum;
			while(check>0){
				x=check%10;
				check=check/10;
				sum1=sum1+x;
			}
			if(sum1==i){
			System.out.println(sum);
			break;
			}
		}
	}
	

}
