package com.reactive;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;

public class FirstPublisher {
	public static void main(String n[]) throws InterruptedException{
		SubmissionPublisher<String> publisher=new SubmissionPublisher<String>();
		FirstSubscriber sc=new FirstSubscriber();
		publisher.subscribe(sc);  //connection publisher with subscriber
       
		publisher.submit("My First Message");
		int i=0;
		while(i<4){
			publisher.submit("Message "+String.valueOf(Math.round(Math.random()*10000)));
			
			i++;
		}
		
	  
		
		  publisher.close();
		  
		  Thread.sleep(1000);
		
		
	}
	
	

}
/*

    MyProcessor p=new MyProcessor((x)-> {
			System.out.println(x);
			return x;
		});

 publisher.subscribe(p);
	   p.subscribe(sc);

*/