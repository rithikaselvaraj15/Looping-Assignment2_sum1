// 1.ATM PIN Retry System
// Ask the user to enter a PIN.
// Allow unlimited attempts until the correct PIN is entered (use while).


package com.index;

import java.util.Scanner;

public class Looping_assignment2 {

	public static void main(String[] args) {
		
		
	Scanner obj=new Scanner(System.in) ;
	int correctpin = 1234;
	int enteredtime =0;
	
	while(enteredtime!= correctpin) {
		
		System.out.println("enter the correct pin ");
	
	  enteredtime =obj.nextInt();
	}
	
	System.out.println("pin correct");
	 
	}}
