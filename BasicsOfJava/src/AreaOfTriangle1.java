import java. util .Scanner;
public class AreaOfTriangle1 {

	public static void main(String[] args) {
     
		double b,h,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of base :");
		b = sc.nextDouble();
		System.out.println("Enter the value of height :");
		h = sc.nextDouble();
		
		area = (b*h)/2;
		System.out.println("Area Of Triangle:" +area);
		
		sc.close();
		
	}

}
