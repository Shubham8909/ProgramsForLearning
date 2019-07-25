package com.testing.program;
public class ReverseString {
   public static void main(String[] args) {
   String str= "hsd@%%jhayd$%67";
   char cStr[] =str.toCharArray();
   int s=0;
   int l=str.length()-1;
   while(s<l){
	   if(!Character.isAlphabetic(cStr[s]) && !Character.isDigit(cStr[s])){
		   s++;
	   }else if(!Character.isAlphabetic(cStr[l]) && !Character.isDigit(cStr[l])){
		   l--;
	   }else{
		   char c= cStr[s];
		   cStr[s]= cStr[l];
		   cStr[l]=c;
		   l--;
		   s++;
	   }
   }
   System.out.println(str);
   String str1= new String(cStr);
   System.out.println(str1);
	}
}
