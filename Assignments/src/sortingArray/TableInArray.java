package sortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class TableInArray {
//	20. Accept number from user and add table of number in array and display 20. Accept number from user and add table of number in array and display 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int a[] = new int[10];
		int cnt = 1;int table = 0;
		for(int i = 1; i <= 10;i++)         //a.length
		{
			table =  num * i;
			//a[i] = num * cnt;
			//cnt++;
		}
		System.out.println(table);
		//System.out.println(Arrays.toString(a));
	}

}
