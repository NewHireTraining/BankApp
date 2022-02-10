package com.csscorp.oops.inheritance.simple;

public class Animal {

	
	protected static void canStaticbeInherited()
	{
		System.out.println("inside parent class static method which shows that we can access "
				+ "parent class static methods with child constructor");
	}
	
	protected  void checkOverridingOfAccess()
	{
		System.out.println("inside parent class method with access as protected");
	}

}


/*
To Sum up
static and final can be inherited
static and final cant be overriden - will give error if we use @override symbol

if static method declared again in child class without override notation, it will be a new implementation.can be verified since they dont take
part in polymporphism since they are associated with class and not instance. 


*/