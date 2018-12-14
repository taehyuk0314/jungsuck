package ch4;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
			
		}
		System.out.println();
		for(int i =0; i<numArr.length;i++) {
			boolean changed = false;
			
			for(int j =0;j<numArr.length-1;j++) {
				if(numArr[j]>numArr[j+1]) {
					int temp = numArr[j];
				}
			}
		}
	}
}
