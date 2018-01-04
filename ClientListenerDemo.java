import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;


public class ClientListenerDemo extends Thread
{
	public Socket a;
	
	public void getServSck(Socket b)
	{
		a=MyClientDemo.sock;
	}
	public void run()
	{
		try 
		{
			//System.out.println("CLIENT listening");
			String str="";
			while(!(str.equals("STOP")))
			{
				DataInputStream bis=new DataInputStream(MyClientDemo.sock.getInputStream());
				str=bis.readUTF();
				System.out.println(str);
			}
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}
}
