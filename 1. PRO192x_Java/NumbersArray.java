import java.util.*;

public class NumbersArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//get an array of ten integers
		int size = 10;
		int[] numbers = input_number_array(sc, size);
		sc.close();
		
		//search and print maximum value in the array
		int max_num = max_num(numbers);
		System.out.printf("%d\n", max_num);
	}
	
	public static int[] input_number_array(Scanner sc, int size) {
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		return array;
	}
	
	public static int max_num(int[] numbers) {
		int max_num = 0;
		for(int i = 0, length = numbers.length; i < length; i++) {
			if(i == 0) max_num = numbers[i];
			if(max_num < numbers[i]) max_num = numbers[i];
		}
		
		return max_num;	
	}
}
