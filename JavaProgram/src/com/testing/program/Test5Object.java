package com.testing.program;

public class Test5Object {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Create5Object c= Create5Object.getobject();
		Create5Object c1= Create5Object.getobject();
		Create5Object c2= Create5Object.getobject();
		Create5Object c3= Create5Object.getobject();
		Create5Object c4= Create5Object.getobject();
	//	Create5Object c5= Create5Object.getobject();
		Create5Object c5= (Create5Object)c4.clone();
		
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		
		System.out.println(c2.hashCode());System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c5.hashCode());

	}

}
