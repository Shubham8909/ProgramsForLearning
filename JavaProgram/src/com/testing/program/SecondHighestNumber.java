package com.testing.program;

public class SecondHighestNumber {

	public static void main(String[] args) {
/*
		int arr[] = { 14, 46, 47, 94, 94, 86, 36, 89 };
		int high1=0;
		int high2=0;
        int temp1=0;*/
        
        int arr[] = { 14, 46, 47, 94, 94, 94, 86, 36, 94, 89 };
                int largest = arr[0];
                int secondLargest = arr[0];
                
                int third=arr[0];
                System.out.println("The given array is:");
                for (int i = 0; i < arr.length; i++)
                {
    
                    System.out.print(arr[i] + "\t");
                }
                for (int i = 0; i < arr.length; i++)

                {
                    if (arr[i] > largest)
                    {   
                  	    third=secondLargest;
                        secondLargest = largest;
                        largest = arr[i];
                    }
                    else if (arr[i] > secondLargest && arr[i] != largest)
                    {
                    	third=secondLargest;
                        secondLargest = arr[i]; 
                    }
                    else if (arr[i] > third && arr[i] != secondLargest)
                    {
                    	third= arr[i]; 
                    }
      
                }
        
                System.out.println("\nSecond largest number is:" + secondLargest +"    "+third);
    
            }

/*
		for (int i = 0; i < arr.length; i++) {
			if(i+1<arr.length){
				if(arr[i]>high1){
					temp1=high1;
                    high1=arr[i];
				}
				if(temp1>high2){
					high2=temp1;
				}
				if(high2<arr[i+1]){
                 high2=arr[i+1]; 
				}
            if(high1<high2){
            	int temp =high1;
            	high1=high2;
            	high2=temp;
            }
            
            System.out.println(high1+"  "+high2);
			
			}
	}
		
		System.out.println(high2);*/
}

