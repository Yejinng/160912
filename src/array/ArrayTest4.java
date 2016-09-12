package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result = 0;
		for (int i = 0; i < intArray.length; i++) {
			//intArray가 5개이니까 4까지다 그래서<=가 아니라<이다
			System.out.println(i + ":" + intArray[i]);
			result = result + intArray[i];
		}

		System.out.println("result: " + result);

	

	//확장 for
	for( int value : intArray)	{
		System.out.println(value);
		result = result + value;
		}
	System.out.println("result: " + result);
	}
}
