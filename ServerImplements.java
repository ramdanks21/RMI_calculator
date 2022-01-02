//ServerImplements.java

import java.rmi.*;
import java.rmi.server.*;
import java.lang.String;
interface RemoteInterface extends Remote
{
	public int add(int x,int y)throws Exception;
	public int kali(int x,int y)throws Exception;
	public int bagi(int x,int y)throws Exception;
	public int kurang(int x,int y)throws Exception;
	public int sisabagi(int x,int y)throws Exception;
	public int pangkat(int x,int y)throws Exception;
}

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface
{ 	public ServerImplements() throws Exception{
		super();
	}


public int add(int x, int y){
	return (x+y);
}	


public int kali(int x, int y){
	return (x*y);
}	
public int bagi(int x, int y){
	return (x/y);
}	
public int kurang(int x, int y){
	return (x-y);
}	
public int sisabagi(int x, int y){
	return (x % y);
}	
 
public int pangkat(int x, int y){
	return (x ^ y);
}	
 

}