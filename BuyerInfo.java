package Buyer;

public class BuyerInfo {
	
	public int iDNum;
	public String buyerName;
	public String address;
	public int haveMoney; 
	
	public BuyerInfo() {}
	public BuyerInfo(int iDNum, String buyerName, String address,int haveMoney) {
		this.iDNum=iDNum;
		this.buyerName=buyerName;
		this.address=address;
		this.haveMoney=haveMoney;
	}
	public void showBuyerInfo() {
		System.out.println("ID Number�� " +iDNum+"�̰� " +"�̸�: "+buyerName+"�ּ�: "+address+"�������ִ� �ں��� "+haveMoney+"�̴�" );
	}
	
	public int gethaveMoney() {
		return haveMoney;
	}
	public String showBuyerInfo1() {
		return "ID Number�� " +iDNum+"�̰� " +"�̸�: "+buyerName+"�ּ�: "+address+"�������ִ� �ں��� "+haveMoney+"�̴�" ;
	}
	
	public void sethaveMoney(int changeMoney) {
		haveMoney=changeMoney;
	}
}
