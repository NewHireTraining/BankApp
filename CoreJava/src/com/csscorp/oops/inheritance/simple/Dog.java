package com.csscorp.oops.inheritance.simple;

public class Dog extends Animal{

	/**Static methods can be inherited but not overridden :-
	 * will give error if we use @override tag
	 * 
	 * Static methods are inherited in Java but they don't take part in polymorphism because
	 * if we attempt to override the static methods they will just hide the superclass static methods instead of overriding them.also give an
	 */
	
	//@Override
	public static void canStaticbeInherited()
	{
		System.out.println("inside static method of child which isnt overriden");
	}
	
	
	
	public  void checkOverridingOfAccess()
	{
		System.out.println("inside child class overriden method with access as protected,access cant be stringent than existing");

	}
	
	public  void DogMehtod()
	{
		System.out.println("method specific to Dog");

	}


	
	
	public static void main(String arg[])
	{

		Dog d=new Dog();
		d.canStaticbeInherited(); // static methods can be inherited ,use class name preferred
		
		Animal a=new Dog();
		a.canStaticbeInherited();    // shows that it doesnt take part in polymorphism,calls parent method (since they cant be overriden)
		a.checkOverridingOfAccess(); // calls child method, if u press F3 on this method,it will take u to 
										// parent class, but on running invokes child class
		//a.DogMehtod();


/**
 * to sum up:-
 * static can be inherited but it will give  u a warning to invoke it directly
 * static cant be overridden, hence run time polymorphism is not applicable.
 */







	}



	
}
