package registryReader;

import java.lang.reflect.InvocationTargetException;

public class main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		String value = WinRegistry.readString (
			    WinRegistry.HKEY_LOCAL_MACHINE,                             //HKEY
			   "SYSTEM\\CurrentControlSet\\Control\\ComputerName\\ComputerName",           //Key
			   "ComputerName");                                              //ValueName
			    System.out.println("Windows Distribution = " + value); 
	    String domain = WinRegistry.readString(WinRegistry.HKEY_LOCAL_MACHINE, 
	    		"SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Group Policy\\History", 
	    		"MachineDomain");
	    System.out.println("Windows domain = " + domain);
		
	}

}
