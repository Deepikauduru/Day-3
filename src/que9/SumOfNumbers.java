package que9;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a,i=1,sum=0;
		System.out.println("Enter the n value ");
		 n=sc.nextInt();
		 while(i<=n){
			 System.out.println("Enter the number");
			 a=sc.nextInt();
			 i++;
			 if(a>=0){
				 sum=sum+a;
			 }
			 
		 }
		 System.out.println("The sum is:" +sum);


	}

}
