import java.util.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class PrintC extends UnicastRemoteObject implements PrintI {
	Scanner sc = new Scanner(System.in);
    public PrintC () throws Exception {
    	super();
    }
	
    public void printmsg() throws RemoteException {
    	String s;
    	System.out.println("Enter a string");
    	s=sc.next();
    	int n=s.length();
    	int flag=0;
    	for(int i=0;i<n/2;i++) {
    		if(s.charAt(i)!= s.charAt(n-i-1)) {
    			flag=1;
    			break;
    		}
    		if(flag==1){
    			System.out.println("String is not a pallindrome");
    		}
    		else {
    			System.out.println("String is a pallindrome");
    		}
    	}
    	
    }
    public void checkPass() throws RemoteException {
    	String Pass;
    	System.out.println("Enter Password");
    	Pass= sc.next();
    	if(Pass.equals("12345")) {
    		System.out.println("Entered password is right");
    	}
    	else {
    		System.out.println("Entered password is wrong ");
    	}
    }
    

}
