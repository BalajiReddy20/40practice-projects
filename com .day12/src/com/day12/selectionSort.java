package com.day12;

public class selectionSort {
    public static void main(String[] args) {

    int[] arr = {9,6,3,1,2,4,5};
    selectionSort1(arr);
    System.out.println("The sorted elements are:");
    for(int i:arr){

        System.out.println(i);
         }
    }

    private selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		
    }

	public static void selectionSort1(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }
	}
}

        
	



