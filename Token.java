import java.io.*;
public class Token
{
	public static void main(String[] args) throws IOException
	{
		FileReader reader = new FileReader("MyFile.txt");
		BufferedReader bufferread = new BufferedReader(reader);
		StreamTokenizer token = new StreamTokenizer(bufferread);
		
		token.eolIsSignificant(true);
		System.out.println("Line Number: " + token.lineno());
		int t;
		while ((t = token.nextToken()) != StreamTokenizer.TT_EOF)
		{
			switch (t)
			{
			case StreamTokenizer.TT_EOL:
				System.out.println("Line No. : " + token.lineno());
				break;
			case StreamTokenizer.TT_NUMBER:
				System.out.println("Number : " + token.nval);
				break;
			case StreamTokenizer.TT_WORD:
				System.out.println("Word : " + token.sval);
				break;
			}
		}
	}
}
