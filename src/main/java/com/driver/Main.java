package com.driver;

public class A {

  public String meth(){

    return "Invoking";
  }
  
  
}
public class B extends A {

  public String meth(){

    return "Method is Overriden in extended";

    public static void main(String args[]){

      B b = new B();
      System.out.print(b.meth);
    }
}
