import java.io.IOException;
import java.net.Socket;


public class MyClientDemo 
{
	public static Socket sock;
	public static void main(String[ ] args)
	{
		try 
		{
			sock=new Socket("localhost",5773);
			//ClientListenerDemo p= new ClientListenerDemo();
			//p.getServSck(sock);
			ClientListenerDemo sread= new ClientListenerDemo();
			sread.start();
			ClientWriterDemo swrite=new ClientWriterDemo();
			swrite.start();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
}
