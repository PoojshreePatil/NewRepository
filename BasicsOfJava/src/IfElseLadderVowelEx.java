import java.util.Scanner;

public class IfElseLadderVowelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character ");
		ch = sc.next().charAt(0);
		
		if(ch=='A' || ch=='a')
		    System.out.println("Vowel");
			
		else if(ch=='E' || ch=='e')
			System.out.println("Vowel");
		
		else if(ch=='I' || ch=='i')
			System.out.println("Vowel");
		
		else if(ch=='O' || ch=='o')
			System.out.println("Vowel");
		
		else if(ch=='U' || ch=='u')
			System.out.println("Vowel");
		
		else
			System.out.println("Consonant");

		sc.close();
		
	}
}
