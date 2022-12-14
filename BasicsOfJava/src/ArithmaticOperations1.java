import java.util.Scanner;
public class ArithmaticOperations1 {

	public static void main(String[] args) {
 
		int a,b,add,sub,multi,div,mdivi;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers:");
		a = sc.nextInt();
        b =	sc.nextInt();
        
        add = a + b;
        System.out.println("Addition is: " +add);
        
        sub = a - b;
        System.out.println("Subtraction is: " +sub);
        
        multi = a * b;
        System.out.println("Multiplicationtion is: " +multi);
        
        div = a / b;
        System.out.println("division is: " +div);
        
        mdivi = a % b;
        System.out.println("Modulo division is: " +mdivi);
        
	    sc.close();
	
	}

}
