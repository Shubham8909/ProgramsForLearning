package com.testing.program1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Unboxing {

	int i=10;
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException{
    	
    	
    	     String str="afashgdshfsghjdfjdghjghjdfjhfj";
    	     System.out.println(str.getBytes() +" "+str);
    	     
    /*  Singleton s1= Singleton.getInstance();
    	
    	
    	Class d=  Class.forName("com.testing.program1.Singleton");
    	
    	Constructor c[] =d.getDeclaredConstructors();
    	c[0].setAccessible(true);
    	Singleton s2   =(Singleton)c[0].newInstance(null);
    	
    	System.out.println(s1.hashCode());
    	
    	System.out.println("----"+s2.hashCode());
    	*/
    
    	//its for field
    /*	Field f= d.getDeclaredField("x");
    	f.setAccessible(true);
    	Constructor[] con= d.getConstructors();
    	  con[0].setAccessible(true);
    	Integer d1= (Integer) f.get(new DefaultClass());
    	  */
    	
    }
}
