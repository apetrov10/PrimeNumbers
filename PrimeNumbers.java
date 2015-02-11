package com.apetrov10.primenumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {
	
	private static int readFromConsole(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String text = null;
	    //reading from console
	    System.out.println("Enter number: ");
	    try{
	    	text = reader.readLine();
    	} catch (IOException e) {
            System.out.println("Please try again!");
	    }
	    int val=0;
	    try{
	    	val = Integer.parseInt(text);
    	} catch (NumberFormatException e) {
            System.out.println("Invalid number!");
	    }
	    return val;
	}
	
	public static void main(String[] args){
		int value = readFromConsole();
		int border = value*value;
		int num = 2;
		int step = 0;
		boolean isPrime = true;
		
		while (step<border){
			for(int i = 2; i<=Math.sqrt(num); i++){
				if( num % i == 0){
					isPrime = false;
					break;
				}
			}
			if (isPrime){
				System.out.print(num + " ");
				step++;
			}
			if ((step%value == 0)&&(isPrime)){
				System.out.println();
			}
			isPrime = true;
			num++;
			
		}
	}
}
