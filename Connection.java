import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Connection implements Runnable {
    Socket s ;
    static int c=0 ;
        public static void main(String[] args) throws Exception {
       
            
}

        public Connection(Socket s) {
            this.s = s;
            c++ ;
            //incriemente le nombre de clien 
        }

        @Override
        public void run() {
          DataOutputStream dos = new DataOutputStream(s.getInputStream());
          dos.writeUTF("client numero :"+c);
          DataInputStream dis = new DataInputStream(s.getInputStream());



          dos.close();
          dis.close();
        }}
