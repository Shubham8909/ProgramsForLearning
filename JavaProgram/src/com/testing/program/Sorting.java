package com.testing.program;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {
	public static void main(String[] args) {
		Customer c0= new Customer(1, "Shubham", "Asv.verma@tcs.com");
		Customer c1= new Customer(2, "AShubham", "Csv.verma@tcs.com");
		Customer c2= new Customer(3, "DShubham", "Osv.verma@tcs.com");
		Customer c3= new Customer(4, "CShubham", "Isv.verma@tcs.com");
		Customer c4= new Customer(5, "VShubham", "Ksv.verma@tcs.com");
		Set<Customer> slist= new TreeSet<>(new MyComparator1() );
		slist.add(c0);
		slist.add(c1);
		slist.add(c2);
		slist.add(c3);
		slist.add(c4);
		System.out.println(slist.size());
		for(Customer c:slist){
			System.out.println(c);
		}
	}
}
 class MyComparator1 implements Comparator<Customer>{
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getName().compareTo(o2.getName());
		
	}
	 
 }