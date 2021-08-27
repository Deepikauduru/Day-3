package que1;
import java.util.Scanner;
public class Amoeba {

	public static void main(String[] args) {
		System.out.println("enter the number of months");
		Scanner sc=new Scanner(System.in);
		int b=0,c=1,d=0;
		int a=sc.nextInt();
		for(int i=2;i<a;i++)
		{
			d=b+c;
			b=c;
			c=d;
			
		}
		System.out.println("the size of amoeba" );		
		System.out.println(d);

	}

}
