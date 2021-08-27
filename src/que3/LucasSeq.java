package que3;
import java.util.Scanner;
public class LucasSeq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,c=1,d;
		int n=sc.nextInt();
		System.out.println(+a+""+b+""+c);
		for(int i=4;i<=n;i++){
			d=a+b+c;
			System.out.println(d);
			a=b;
			b=c;
			c=d;
			
			
		}
	}

}
