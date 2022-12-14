import java.util.Scanner;
public class AreaOfCircle1 {

	public static void main(String[] args) {
		
     
	float radius,pi = 3.14f,area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of Radius: ");
    radius = sc.nextFloat();
    
    area = pi*radius*radius;
    
    System.out.println("Area of Circle: " +area);
    sc.close();
	}

}
