package oopsconcepts;

public class ArraysEx {

	public static void main(String[] args) {
		int[] arr; //initializing
		arr = new int[5]; //declaring
//		int[] arr1 = new int [5];
		
		arr[0]=1;
		int [] arr1= {1,2,3,4,5};
		//System.out.println(arr1); //arr1 will be store in stack and values are stored in heap
		System.out.println(arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("using for each --enhanced for loop");
		for(int x:arr1) {
			System.out.println(x);
		}
		
		//largest element
		
		int max =arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max = arr1[i];
			}
		}
		System.out.println("The largest value is " +max);
		
		
		//Sum of an array
		int sum =0;
		for(int x: arr1) {
			sum = sum+ x;
		}
		System.out.println("The sum of an array is "+sum);
		
		
	}

}
