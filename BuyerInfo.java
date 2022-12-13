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
		System.out.println("ID Number는 " +iDNum+"이고 " +"이름: "+buyerName+"주소: "+address+"가지고있는 자본은 "+haveMoney+"이다" );
	}
	
	public int gethaveMoney() {
		return haveMoney;
	}
	public String showBuyerInfo1() {
		return "ID Number는 " +iDNum+"이고 " +"이름: "+buyerName+"주소: "+address+"가지고있는 자본은 "+haveMoney+"이다" ;
	}
	
	public void sethaveMoney(int changeMoney) {
		haveMoney=changeMoney;
	}
}
