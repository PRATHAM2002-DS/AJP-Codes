import java.rmi.*;
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       PrintI obj = (PrintI) Naming.lookup("rmi://localhost:6000/SHOWMSG");
       obj.printmsg();
       obj.checkPass();
       
	}

}
