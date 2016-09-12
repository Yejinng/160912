package array;

public class Echo {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		for( String s : args )	{
			System.out.println(s);
		}
	    for( int i = 0; i < args.length; i++){ 
	        System.out.println( args[ i ] ); 
	     } 


	}

}
//run-> run configuration -> Echo -> argument