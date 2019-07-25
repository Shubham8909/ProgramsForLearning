package com.testing.program;

public class Customer /*implements Comparable<Customer>*/ {
	
	private int id;
	private String name;
	private String email;
	
	public Customer(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	/*@Override
	public int compareTo(Customer o) {
		int sign=0;
		if(this.id>o.id){
			sign=-1;
		}else if(this.id<o.id){
			sign=+1;
		}else{
			sign=0;
		}
		
		return sign;
	*/
	//}

}
