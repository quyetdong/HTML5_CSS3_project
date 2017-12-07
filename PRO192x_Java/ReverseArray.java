import java.util.*;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//get an array of ten integers
		int size = 10;
		int[] numbers = input_number_array(sc, size);
		sc.close();
		
		//print reversed-array
		print_reversed(numbers);
	}
	
	public static int[] input_number_array(Scanner sc, int size) {
		System.out.printf("Input an array of %d integers\n", size);
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		return array;
	}
	
	public static void print_reversed(int[] numbers) {
		int length = numbers.length;
		for(int i = 1; i < length + 1; i++) {
			System.out.printf("%d ", numbers[length - i]);	
		}	
	}
}
