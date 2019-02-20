
public class Fibonacci {
public static void main(String [] Args) {
	int num1 = 0;
	int num2 = 1;
	int temp = 0;
	for(int x = 0; x < 100; x++) {
		temp = num1 + num2;
		System.out.println(temp);
		num2 = num1;
		num1 = temp;
	}
}
}
