//XOBIN CODE OF ANAGRAM STRING
import java.util.Scanner;
import java.util.Arrays;
class Main {

	public static boolean checkAnagram(String first, String second) {
		boolean isAnagram = false;

		// write Logic Here

    if(first.length()==second.length())
    {
    	char a[]=first.toCharArray();
     	char b[]=second.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);

	for(int i=0;i<a.length;i++) 
  {
			if(a[i]!=b[i]) 
      {
				isAnagram=false;
      }
			else
      {
        isAnagram=true;
      }
    }
  }
 else 
 {
		 isAnagram=false;
	 }
    
		return isAnagram;

	}

	public static void main(String[] args) {
    //DO NOT EDIT GIVEN CODE
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
	//LOGIC FOR METHOD CALL
    Main m = new Main();
    
    Boolean isAnagram = m.checkAnagram(first,second);
		System.out.println(isAnagram);

	}
}