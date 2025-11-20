package oopsconcepts;

public class Example2DArray {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{2,4,5},{5,6,8}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
	}
}
