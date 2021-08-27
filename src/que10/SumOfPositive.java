package que10;
import java.util.Scanner;
public class SumOfPositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a,i=1,sum=0,count=0;
		System.out.println("Enter the n value ");
		 n=sc.nextInt();
		 while(i<=n){
			 System.out.println("Enter the number");
			 a=sc.nextInt();
			 i++;
			 if(a>=0){
				 count++;
				 sum=sum+a;
			 }
		 }
	  
		 System.out.println("Number of positive numbers enterd is:" +count+"and sum is:" +sum);
	

	}

}
