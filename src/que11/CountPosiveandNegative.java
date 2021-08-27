package que11;
import java.util.Scanner;

public class CountPosiveandNegative {
	Scanner sc=new Scanner(System.in);
	int n,a,i=1,count=0,count1=0;
	System.out.println("Enter the n value");
	n=sc.nextInt();
	while(i<=n)
	{
		System.out.println("Enter the number");
	    a=sc.nextInt();
		i++;
		if(a>=0){
			count++;
			 }
		 else if(a>=0){
			 count1++;
			 }
		 }
	  
		 System.out.println("Number of positive numbers enterd is:" +count);
		 System.out.println("Number of negative numbers enterd is:" +count1);
		

	}

}
