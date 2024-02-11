package javapractice;
public class SybaseDB implements MyInter {
	public void connect() {
		System.out.println("connecting to sybase database");
	}
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnected from sybase");
	}	
}
