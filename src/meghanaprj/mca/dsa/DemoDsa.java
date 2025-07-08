package meghanaprj.mca.dsa;
import java.util.ArrayList;

public class DemoDsa {
	public static void main(String[]args) {
		ArrayList<Integer> n=new ArrayList<>();
		
		n.add(10);
		n.add(20);
		n.add(3);
		n.addFirst(78);
		n.addLast(19);
		n.add(2,400);
		System.out.println(n);
	}

}
