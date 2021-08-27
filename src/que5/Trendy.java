package que5;
import java.util.Scanner;
public class Trendy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n>100&&n<999){
			int mid=((n/10)%10);
			if(mid%3==0){
				System.out.println("Trendy number");
			}		
		}
		else{
			System.out.println("Not a Trendy number");
		}

	}

}
