public class multiclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Socket s=new Socket ("127.0.0.1",1234);){
		
		
		DataInputStream dis =new DataInputStream (s.getInputStream());
		System.out.println(dis.readUTF());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
