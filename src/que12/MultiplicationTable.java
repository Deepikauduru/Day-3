package que12;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,num=1;
		System.out.println("enter n value");
		n=sc.nextInt();
		System.out.println("enter m value");
		m=sc.nextInt();
		while(num<=m){
			int a=num*n;
			System.out.println(num+"*"+n+"="+a);
			num++;
		}
		

	}

}
