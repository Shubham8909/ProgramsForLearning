package com.testing.program;

public class Create5Object implements Cloneable {
	
	 @Override
	public  Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	static int i=0;
	
	private Create5Object(){
		
	}

	public static Create5Object getobject(){
		if(i<5){
			i++;
			System.out.println("Object Created "+i);
			return new Create5Object();
		}else{
			throw new RuntimeException("Not able to creat ");
		}
	}

}
