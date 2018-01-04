import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServerDemo 
{
	public static Socket cl;

	public static void main(String[ ] args)
	{
		try 
		{
			ServerSocket servSock=new ServerSocket(5773);
			cl=servSock.accept();
			//ServerListenerDemo p= new ServerListenerDemo();
			//p.getServSck(cl);
			ServerListenerDemo sread= new ServerListenerDemo();
			sread.start();
			//ServerListenerDemo p1= new ServerListenerDemo();
			//p1.getServSck(cl);
			ServerWriterDemo swrite=new ServerWriterDemo();
			swrite.start();
			servSock.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
}
