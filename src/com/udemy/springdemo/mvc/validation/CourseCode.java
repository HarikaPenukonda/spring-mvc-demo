package com.udemy.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	// define default course code
	public String value() default "CS";
	// define default error message
	public String message() default "must start with CS";
	// define default groups, to group validation constraints together
	public Class<?>[] groups() default {};
	// define default payloads, payload to give additional information about the validation error
	public Class<?extends Payload> [] payload() default {};

}
