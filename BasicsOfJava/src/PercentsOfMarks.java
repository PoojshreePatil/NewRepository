import java.util.Scanner;
public class PercentsOfMarks {

	public static void main(String[] args) {
		
		int s1,s2,s3,total,per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of 3 subjects :");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		
		total = s1+s2+s3;
		per = (total*100)/300;
		System.out.println("Pecentage is:" +per);
		sc.close();
		
	}

}
