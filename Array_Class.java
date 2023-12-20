package pkg1;

import java.util.Arrays;

public class Array_Class {
	public void show_Array(int arr[]) {
		System.out.println("The Array Elements Are..");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
		
	public void add_Element(int arr[], int value) {
		int size = arr.length;
		int new_array[] = new int[size+1];
		for(int i = 0; i < size; i++) {
			new_array[i] = arr[i];
		}
		new_array[size] = value;
		System.out.println("The New Array is..");
		for(int i = 0; i < new_array.length; i++) {
			System.out.println(new_array[i]+" ");
		}
	}
	
	public void search_Element(int arr[], int value) {
		int flag = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				System.out.println("The Element "+value+" is at index "+i);
			    break;}
			else
				flag = 1;
		}
		if(flag == 1) {
			System.out.println("The Element Not Found");
		}
	}
	
	public void sort_Array(int arr[]) {
		int temp = 0;
		int new_Array[] = arr; 
		System.out.println("The Sorted Array is..");
		for(int i = 0; i < new_Array.length; i++) {
			for(int j = 1; j < new_Array.length; j++) {
				if(new_Array[i] > new_Array[j]) {
					temp = new_Array[i];
					new_Array[i] = new_Array[j];
					new_Array[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < new_Array.length; i++) {
			System.out.println(new_Array[i]+" ");
		}
		
	}
	
	

}

