package singleton;

public class StatefulService {

	//private int price; //상태유지 필드 <-- 무상태가 아닌 코드

	public int order(String name, int price) {
		System.out.println("name = " + name + " price = " + price);
		//this.price = price; //여기가 문제!
		return price;
	}
/*	public int getPrice() {
	//	return price;
	}*/
}
