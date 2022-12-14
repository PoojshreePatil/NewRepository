import java. util .Scanner;
public class AreaOfRectangle1 {
public static void main(String[] args) {
	
	double l,w,area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of length : ");
	l = sc.nextDouble();
	System.out.println("Enter the value of width: ");
	w = sc.nextDouble();
	
	area = l * w;
	System.out.println("Area of rectangle is :" +area);
	sc.close();
}
}
