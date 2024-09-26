//generated probem if we do not use the java bean class instead

package com.hub;

public class Problem {
	 String name;
	 int age;
	 String color;
	 
	 public void show(String name,int age,String color) {
		 this.name=name;
		 this.age=age;
		 this.color=color;	    
	 }
	 // printing the output using toString method 
	 public String toString() {
		 
		 return    "name:"+name+",age:"+age+",color:"+color;
	 }
	 public static void main(String[]args) {
	   Problem p=new Problem();
	     p.show("Abdulla",20,"green");
      System.out.println(p);
		 
	}

}
