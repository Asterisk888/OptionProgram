package Buyer;

public class BuyerInput {
	public static void main(String[] args) {
		BuyerInfo ChoiMK=new BuyerInfo();
		
		System.out.println (ChoiMK.showBuyerInfo1());
		
		BuyerInfo LeeJY=new BuyerInfo(00000003,"JYLee","�����ֽ�",20000000);
	
		System.out.println (LeeJY.showBuyerInfo1());
	}
}

 