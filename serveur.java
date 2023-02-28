import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serveur {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (//le serveur ouvre un stock t ecoute 
        ServerSocket sc = new ServerSocket(1234); 
        //accept methode attend la coonnection du client 
        Socket socket = sc.accept()) {System.out.println("clien connecter");
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        //cet envoi assure par la class dataoutput
        dos.writeUTF("bien je suis le serveur") ;
       
        
       ObjectInputStream o = new ObjectInputStream(socket.getInputStream());
       System.out.println(o.readObject());
       
       
       
       o.close();
       socket.close();
       dos.close();
// fermer la connection 
    }  ;
           
         
    }}