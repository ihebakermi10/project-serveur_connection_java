


import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import ville ;

public class Client {
public static void main(String[] args) {

try {

Socket socket= new Socket("127.0.0.1", 1234);

DataInputStream dis= new DataInputStream(socket.getInputStream());

String msg = dis.readUTF();
 Scanner scanner= new Scanner(System.in);
	    String nom =scanner.nextLine();
		String pay =scanner.nextLine();
		String population =scanner.nextLine();
			ville v =new ville(nom,pay,population) ;
		ObjectOutputStream sos = new ObjectOutputStream(socket.getOutputStream());
			sos.writeObject(v);


System.out.println("le serveur m'a dit: "+msg);
sos.close();socket.close();}

 catch (Exception e) {

// TODO Auto-generated catch block
e.printStackTrace();
//la connection est caracterise par laddress i et l port 

}

}}



