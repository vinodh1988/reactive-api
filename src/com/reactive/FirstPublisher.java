package com.reactive;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;

public class FirstPublisher {
	public static void main(String n[]) throws InterruptedException{
		SubmissionPublisher<String> publisher=new SubmissionPublisher<String>();
		FirstSubscriber sc=new FirstSubscriber();
		publisher.subscribe(sc);
		//logic here
		publisher.submit("My First Message");
		while(true){
			publisher.submit("Message "+String.valueOf(Math.round(Math.random()*10000)));
			if(sc.getCount()>=7)
				break;
		}
		
		publisher.close();
		Thread.sleep(10000);
		
		
	}

}
