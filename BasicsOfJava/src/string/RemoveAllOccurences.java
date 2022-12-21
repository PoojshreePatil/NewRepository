package string;

public class RemoveAllOccurences {

	public static void main(String[] args) {

		String s = "Java is Language Core Java is Language";
		String s1[] = s.split(" ");
		String s2 =" ";
		for(int i = 0; i< s1.length;i++)
		{
			int cnt = 0;
			for(int j = i + 1; j< s1.length;j++)
			{
				if(s1[j].equalsIgnoreCase(s1[i]))
				{
					cnt++;
					s1[j] = "0";
				}
			}
			if(!s1[i].equals("0")&&cnt == 1)
			{
				s2 = s2 + s1[i]+" ";
			}
		}
	
		System.out.println(s2);
	}

}
