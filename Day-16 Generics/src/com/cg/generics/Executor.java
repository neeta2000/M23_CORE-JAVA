package com.cg.generics;

public class Executor {

	public static void main(String[] args) {
		//create a sender to send a string message
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generics class demo");
		obj.sendMessage();
		
		//create an email object to be send using sender
		Email em=new Email();
		em.setFrom("palaveneeta2015@gmail.com");
		em.setTo("shraddhakharnare@gmail.com");
		em.setSubject("Java full stack");
		em.setBody("About Training and placement");
		System.out.println(em.getBody());
		
		//create a sender to send this email
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);

		obj1.sendMessage();
		

	}

}
