import java.util.Scanner;

public class ExampleMinNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 st number: ");
		int a = sc.nextInt();
		System.out.println("Enter the 1 st number: ");
		int b = sc.nextInt();
		int c = minFunction(a, b);
		System.out.println("Minimum Value = " + c);
	}
	public static int minFunction(int n1, int n2){
		int min;
		if(n1>n2)
			min = n2;
		else
			min = n1;
		
		return min;
	}
}