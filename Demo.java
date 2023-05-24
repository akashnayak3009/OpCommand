public class Demo{
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void reverseArray(int[] numbers, int start , int end){
		while(start<end){
			int temp = numbers[start];
			numbers[start]= numbers[end];
			numbers[end]=temp;
			start++;
			end--;

		}
	}
	public static void main(String[] args){
		int[] numbers={5,7,8,4,5,2,11,22,43};
		printArray(numbers);
		reverseArray(numbers,0,numbers.length-1);
		printArray(numbers);
	} 
}