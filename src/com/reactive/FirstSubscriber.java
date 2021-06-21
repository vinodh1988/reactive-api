package com.reactive;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class FirstSubscriber implements Subscriber<String>{
public Subscription subscription;
private int count;
	@Override
	public void onSubscribe(Subscription subscription) {
		// TODO Auto-generated method stub
		this.subscription=subscription;
		subscription.request(7);
	}

	@Override
	public void onNext(String item) {
		// TODO Auto-generated method stub
		System.out.println("Received "+item);
		count++;
	}

	@Override
	public void onError(Throwable throwable) {
		// TODO Auto-generated method stub
		System.out.println("Something wrong");
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		System.out.println("Subscription completed");
	}
	
	public int getCount() {
		return count;
	}

}
