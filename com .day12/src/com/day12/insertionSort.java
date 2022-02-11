package com.day12;

public class insertionSort {
	
	public static  void main(String args[]){

        int[] arr = {9,12,3,21,44};
        insertionSort1(arr);
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }
     }
    private insertionSort(int arr[]) {
		// TODO Auto-generated method stub
		
	}
	public static void insertionSort1(int[] arr){

    int len = arr.length;
    for(int j=1;j<len;j++){
    int key = arr[j];
    int i=j-1;
    while ((i>-1) && (arr[i]>key)){

        arr[i+1]=arr[i];
        i--;
    }
    arr[i+1]=key;
         }

    }

}
