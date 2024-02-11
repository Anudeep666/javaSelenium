package javapractice;
public class OracleDB implements MyInter {
public void connect() {
	System.out.println("connecting to oracle database");
}
@Override
public void disconnect() {
	// TODO Auto-generated method stub
	System.out.println("disconnect to oracle");
}
}
