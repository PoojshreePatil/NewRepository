import java.util.Scanner;
public class PercentageAndGrade {

	public static void main(String[] args) {
		
		int s1,s2,s3,s4,s5,total,per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of 5 subjects :");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		
		total = s1+s2+s3+s4+s5;
		per = (total*100)/500;
		System.out.println("Pecentage is:" +per);
		
		if(per >= 85)
		{
			System.out.println("A+");
		}
		else if(70 < per )
		{
			System.out.println("A");
		}
		else if(55 < per )
		{
			System.out.println("B");
		}
		else if( 45 < per)
		{
			System.out.println("C");
			
		}
		else if(35 < per )
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		sc.close();
	}

}
