package com.function;

import java.util.function.Consumer;

public class FunctionalAPI {
   public static void main(String[] args) {
	 Consumer<String> consumer = x->{
		 System.out.println("Consumed and processed "+x);
	 };  
	   
	 consumer.accept("fundamentals");
	/* Supplier<String> supplier=()-> "Whole World .....!!!!";
	 
	 System.out.println(supplier.get()); */
	   /*
	   Function<Integer,String> fun= x->{
		  return "Number of digits -->"+ String.valueOf(x).length();
	  };
	   
	  
	  System.out.println(fun.apply(123466));*/
	   /* Predicate<String> p = x->{
		   return x.length()>5?true:false;
	   };
	   
	   if(p.test("indus"))
		   System.out.println("Working");
	   else
		   System.out.println("Not Working");*/
	   
	   
   }
}
