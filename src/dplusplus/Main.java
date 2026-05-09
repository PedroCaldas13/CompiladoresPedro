package dplusplus;

import java.io.FileReader;
import java.io.PushbackReader;

import dplusplus.lexer.Lexer;
import dplusplus.node.EOF;
import dplusplus.node.Token;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "teste/teste.dpp";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				System.out.println(token.getClass());
				System.out.println(" ( "+token.toString()+")");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}