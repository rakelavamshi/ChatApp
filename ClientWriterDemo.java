import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ClientWriterDemo extends Thread 
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
				BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dout=new DataOutputStream(MyClientDemo.sock.getOutputStream());
				str=bis.readLine();
				dout.writeUTF(str);
			}
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
