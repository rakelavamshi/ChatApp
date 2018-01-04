import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ServerWriterDemo extends Thread 
{
	 /*public Socket a;
	
	public void getServSck(Socket b)
	{
		System.out.println("insied serv sck get serv meth");
		a=MyServerDemo.cl;
	}
	*/
	public void run()
	{
		try 
		{
			String str="";
			while(!(str.equals("STOP")))
			{
				//System.out.println("server ready to write ");
				//System.out.println("SocketAddr "+MyServerDemo.cl);
				BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dout=new DataOutputStream(MyServerDemo.cl.getOutputStream());
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
