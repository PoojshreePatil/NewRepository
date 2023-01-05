package patterns;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int j =1,l=0,k,m;
         
       //  k = j*j;
         //m = k*j;
		for(int i =1;i<=5;i++)
		{
		   k = (i*i);
		   m = l*k;
		   System.out.println(j);
	       j = j + m;
	       l++;
		}
		System.out.println();
	}

}
