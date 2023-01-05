package exception;

public class CEFileData {

	void fileNameCheck(String s) throws FileNameCException
	{
		char ch = s.charAt(0);
		if(Character.isDigit(ch))
		{
			throw new FileNameCException("File Name Does Not Start with digit");
		}
		else
		{
			System.out.println("valid File Name");
		}
	}

	
	public static void main(String[] args) {
		
		CEFileData cef = new CEFileData();
		try
		{
			cef.fileNameCheck("jhsj");
		}
		catch(FileNameCException f)
		{
			f.printStackTrace();;
			//System.out.println(f);
		}
	}
}
