import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;

public class serveurmulticlient {
     Socket s ;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
   try (    ServerSocket sc= new ServerSocket(1234);) {
    while(true){

    
    Socket socket = sc.accept(); 
    Thread th = new Thread(new Connection( Socket));
    th.start(); 
} 
        
    } 
    catch (Exception e) {

        // TODO Auto-generated catch block
        e.printStackTrace();
//les methode output et data input permet de acceder les flux de stock 
   }



}}
