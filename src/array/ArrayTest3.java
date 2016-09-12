package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[]   arrayInt1;		//이 방식 추천
	  //int     arrayInt2[];	배열선언은 두가지 다 가능 but 첫번째꺼 추천
	  //int[10] arrayInt3;		오류
		arrayInt1 = new int[5];
		arrayInt1[0] = 1;
		arrayInt1[1] = 2;
		arrayInt1[2] = 3;
		arrayInt1[3] = 4;
		arrayInt1[4] = 5;
		
		int[] arrayInt4 = {1, 2, 3, 4, 5};
		
		//Book[] books = { new Book(),new Book()};
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May"};
		int[] arrayInt5 = new int[] {10, 20, 30, 40};
		
		
		//error
		//int[] arrayInt6;
		//arrayInt6 ={100, 200, 300, 400};	//new선언하고 해야함
		
		

	}

}
