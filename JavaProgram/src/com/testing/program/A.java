package com.testing.program;

public class A implements Q,W
{
    public static int i;
    public static int j;
	@Override
	public void show() {
		System.out.println("asdbfdhjasf");
	}
}    
/*class B extends A 
{
    int j;
    void display() 
    {
        super.j = 3;
        System.out.println(i + " " + j);
    }
} */   
class Output 
{
    public static void main(String args[])
    {
        A a= new A();
;   
        a.show(); 
    }
}