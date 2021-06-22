package com.reactive;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;



public class MyProcessor extends SubmissionPublisher<String> implements Processor<String , String> {
   Subscription subscription;
  
	private Function<String,String> f;
	 MyProcessor(Function<String,String> f){
		 this.f=f;
	 }
	@Override
	public void onSubscribe(Subscription subscription) {
		// TODO Auto-generated method stub
		this.subscription=subscription;
		this.subscription.request(1);
	}

	@Override
	public void onNext(String item) {
		// TODO Auto-generated method stub
		System.out.println(f.apply("hey"));
		submit(f.apply("transformed "+item));
	
	
	
		this.subscription.request(1);
		
	}

	@Override
	public void onError(Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		System.out.println("Wrapped up");
	}

	

}
