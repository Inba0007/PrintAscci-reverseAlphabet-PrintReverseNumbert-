import java.util.Scanner;

public class WhileLoopReverseNum {

	public static void main(String[] args) {
		int a;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number you want reverse=");
		a=obj.nextInt();
		int number=a;
		int reve=0;

		while(number!=0)
		{
			int rem=number%10;
			reve=reve*10+rem;
			number/=10;
		}
		
		System.out.println(reve);
	}

}
