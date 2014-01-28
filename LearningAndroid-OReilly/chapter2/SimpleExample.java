package com.marakana.examples;

/* 
	a simple class with a basic method
	that instantiates several objects of the cclass,
	manipulates the objects, and outputs information
	about the object


	complied with:
	javac -d . SimpleExample.java
	the '-d' tells compiler the dir structure root is where the java file is

	it is run with
	java -cp . com.marakana.examples.SimpleExample
	where the -cp stands for "class path", or where to find the specified classes
*/
	public class SimpleExample {
		private int number;
		public SimpleExample() {

		}

		public void setValue(int val) {
			number = val;
		}

		public int getNumber() {
			return number;
		}

		public static void main(String[] args) {
			for(int i=0; i<10; i++) {
				SimpleExample example = new SimpleExample();

				if(i/2 <= 2) {
					example.setValue(i);
				} else {
					example.setValue(i * 10);
				}

				System.out.println("SimpleExmaple #"+i+"'s Value is "+example.getNumber());
			}
		}
	}