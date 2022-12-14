import java.util.Scanner;
public class AreaOfSquare {

	public static void main(String[] args) {
    
	int s,area;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the value of Side: ");
	s = sc.nextInt();
	
	area = s*s;
	
	System.out.println("Area Of Square : " +area);
	
	sc.close();
	}

}
