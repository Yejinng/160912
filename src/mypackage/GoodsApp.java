package mypackage;

import chapter02.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setName ("Nikon");
		
		//
		//goods.prince = -1; 인경우 0으로 받게끔 Goods 클래스에서 설정
		goods.setPrice (200000);
		goods.setCountStock (50);
		goods.setCountSold (30);
		
		System.out.println(goods.getName() + ":" + goods.getPrice() + ":" + goods.getCountStock() + ":" + goods.getCountSold());


	}

}
