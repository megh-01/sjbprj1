package meghanaprj.mca.dsa;

public class MainPayment extends Payment{
	void pay() {
		System.out.println("cash payment");

}
	public static void main(String[]args) {
		MainPayment p=new MainPayment();
		p.pay();
		p.printbill(); 
	}
}
