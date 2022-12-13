package Buyer;

public class BuyerOperation {

	public static void main(String[] args) {

		BuyerInfo ChoiMK=new BuyerInfo();
		
		ChoiMK.iDNum=00000001;
		ChoiMK.buyerName="MK CHoi";
		ChoiMK.address="남양주시";
		ChoiMK.haveMoney=10000000;
		
		ChoiMK.showBuyerInfo();
	
		BuyerInfo ChoiDO=new BuyerInfo();
	
		ChoiDO.iDNum=00000002;
		ChoiDO.buyerName="DO CHoi";
		ChoiDO.address="남양주시";
		ChoiDO.haveMoney=100000;
	
		ChoiDO.showBuyerInfo();
		
		System.out.println(ChoiDO);
		System.out.println(ChoiMK);
		}
}

