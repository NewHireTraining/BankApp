package com.csscorp.exceptions.builtin;

//Java program to demonstrate NullPointerException
class NullPointer_Demo
{
  public static void main(String args[])
  {
	  
      try {
          String a = new String(); //null value
          System.out.println(a.charAt(0));
      } catch(NullPointerException e) {
          System.out.println("NullPointerException..");
          System.out.println(e.getMessage());
          e.printStackTrace();
      }
  }
}