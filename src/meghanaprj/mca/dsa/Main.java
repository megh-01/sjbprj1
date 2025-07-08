package meghanaprj.mca.dsa;

public class Main extends Person1 {

	@Override
	void f1() {
		// TODO Auto-generated method stub
		super.f1();
		System.out.println("this is child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main p=new Main();
		p.f1();

	}

}
