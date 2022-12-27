package arrays;

public class MinCharacter {

	public static void main(String[] args) {

	  char arr[] = {'A','D','E','x','z','R'};
	
	  char min = arr[0];
	  for(int i = 1;i<arr.length;i++)
	  {
		  
		  if(arr[i] < min)
		  {
			 min = arr[i]; 
		  }
	  }
	  System.out.println(min);
	}

}
