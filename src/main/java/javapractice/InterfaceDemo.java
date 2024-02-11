package javapractice;
public class InterfaceDemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Class c = Class.forName(args[0]);
		@SuppressWarnings("deprecation")
		MyInter mi = (MyInter)c.newInstance();
		mi.connect();
		mi.disconnect();
	}
}
