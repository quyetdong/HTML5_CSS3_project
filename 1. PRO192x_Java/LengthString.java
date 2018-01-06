import java.util.Scanner;

public class LengthString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp_string = sc.nextLine();
		sc.close();
		
		int length = inp_string.length();
		System.out.printf("Do dai cua chuoi la: %d\n", length);	
	}
}