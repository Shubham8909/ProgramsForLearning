package com.testing.program;
	
	
	
	public class ClassTest {
		 
		  public static void main(String[] args) {
		    int arr[] = {1, 0 , 1, 1, 0 ,1 , 1 ,0, 1,0, 1, 1, 0, 0, 0};
		 
		    for (int i = 1; i < arr.length; i++) {
		       System.out.println(i);
		      if (arr[i] < arr[i - 1]) {
		        arr[i] = arr[i] + arr[i - 1];
		        arr[i - 1] = arr[i] - arr[i - 1];
		        arr[i] = arr[i] - arr[i - 1];
		      }
		      i = 0;
		 
		    }
		    System.out.print("Sorted Array : ");
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		  }
		}

