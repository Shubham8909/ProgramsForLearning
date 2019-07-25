package com.testing.program;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CoustomAnnotaion {
	
	public enum Priority{
		HIGH,LOW ,MEDDIUM;
	}
	Priority priority() default Priority.HIGH;
	String [] tag () default "";
	String createdBy() default "Shubham";
	String lastUpdatedDate() default "30/05/2019";


}
