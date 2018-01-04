import java.io.DataInputStream;


public class ServerListenerDemo extends Thread
{
	/*
	 * public Socket a;
	
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
				//System.out.println("server listening started");
				//System.out.println("Socket Address"+MyServerDemo.cl);
				DataInputStream bis=new DataInputStream(MyServerDemo.cl.getInputStream());
				str=bis.readUTF();
				//str="STOP";
				System.out.println(str);
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}
}
