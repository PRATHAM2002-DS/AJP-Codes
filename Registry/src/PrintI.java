import java.rmi.Remote;
import java.rmi.RemoteException;
public interface PrintI extends Remote {
  public void printmsg()throws RemoteException;
  public void checkPass() throws RemoteException;
}
