package com.capgemini.annotations;
import java.lang.annotation.Documented;
//custom annotation
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface OwnCustom
{
	int accept();
}

class C
{
	@OwnCustom (accept=55)
	public void display()
	{
		System.out.println("Hey , I am using Custom Annotatios");
	}
}
public class CustAnnotations {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException
	{
		C c=new C();
		c.display();
		Method m=c.getClass().getMethod("display");
		OwnCustom obj=m.getAnnotation(OwnCustom.class);
		System.out.println(obj.accept());

	}

}
