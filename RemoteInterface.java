//RemoteInterface.java

import java.rmi.*;
public interface RemoteInterface extends Remote
{
	public int add(int x,int y)throws Exception;
	public int kali(int x,int y)throws Exception;
	public int bagi(int x,int y)throws Exception;
	public int kurang(int x,int y)throws Exception;
	public int sisabagi(int x,int y)throws Exception;
	public int pangkat(int x,int y)throws Exception;
	 
	 
}