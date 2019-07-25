package com.testing.program;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		   int[] arr1 = {1, 3, 8,5}; 
	        int n1 = arr1.length; 
	        
	        int[] arr2 = {8, 8}; 
	        int n2 = arr2.length;
	        
	        int [] arr3= new int[n1+n2];
	        
	       int i=0,j=0, k=0;
	        int count=0;
	       while (i<n1 && j <n2) 
	        { 
	            if (arr1[i] < arr2[j]) 
	                arr3[k++] = arr1[i++]; 
	            else
	                arr3[k++] = arr2[j++]; 
	            count++;
	        } 
	       
	        while (i < n1) {
	            arr3[k++] = arr1[i++]; 
	            count++;
	        }
	     
	        while (j < n2) {
	            arr3[k++] = arr2[j++];
	            count++;
	        }
/*
	       for(int i=0; i<n1;i++){
	    	   arr3[i]=arr1[i];
	       }
	       for(int i=0; i<n2; i++){
	    	       arr3[n1+i]=arr2[i];
	       }
	         Arrays.sort(arr3);
	         int [] arr4=
	       for(int i=0;i<arr3.length;i++){
	    	   
	    	   if(arr3[i]!=arr3[i+1])
	       }*/
	         
	      for(int y=0; y<count;y++){
	    	  System.out.print(arr3[y]+"  ");
	      }
	}

}
