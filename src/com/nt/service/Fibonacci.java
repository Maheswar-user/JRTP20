package com.nt.service;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		 //Initialize array   
       String [] arr = {"hii", "hii", "hii", "hello","hello","bye"};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
}
}
