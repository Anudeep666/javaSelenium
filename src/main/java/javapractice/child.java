package javapractice;
public class child implements Father, Mother {
	@Override
	public void height() {
		// TODO Auto-generated method stub
	float ht = (Father.HT+Mother.HT)/2;
	System.out.println("child's height="+ht);
	System.out.println("hi");
	}
}
