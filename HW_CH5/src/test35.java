import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class test35 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw=new FileWriter("test.txt");
			PrintWriter pw=new PrintWriter(new BufferedWriter(fw));
			
			pw.println("hello!");
			pw.println("goodbye kitty!");
			
			pw.close();
			
			System.out.println("��Ƥw�g�g�J�ɮפF");
		}
		catch(IOException e)
		{
			System.out.println("��X�J���~");
		}	
	}
}