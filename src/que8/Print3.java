package que8;
import java.util.Scanner;
public class Print3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		while(a<=b){
			System.out.println(a);
			a++;
		}
		while(a>=b){
			System.out.println(a);
			a--;
		}

	}

}
