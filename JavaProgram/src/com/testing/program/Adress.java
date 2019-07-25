package com.testing.program;

public class Adress {
	
  private String adName;
  
 public Adress(String name){
	 this.adName=name;
 }

public String getAdName() {
	return adName;
}

public void setAdName(String adName) {
	this.adName = adName;
}

@Override
public String toString() {
	return "Adress [adName=" + adName + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adName == null) ? 0 : adName.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Adress other = (Adress) obj;
	if (adName == null) {
		if (other.adName != null)
			return false;
	} else if (!adName.equals(other.adName))
		return false;
	return true;
}

}
