package array;

public class ArrayTest2 {

	//객체를 저장하는 배열 VS 기본타입을 저장하는 배열
	public static void main(String[] args) {
		Book[] books = new Book[5];
		
		books[0] = new Book();	//이거
		books[0].title = "자바의 정석";
		
		
		//System.out.println(books[]);

	}

}
