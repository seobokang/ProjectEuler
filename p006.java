public class p006 {
	public static void main(String[] args){
			int start = 1;
			int end = 100;
			
			System.out.println(SquareOfSum(start,end)-SumOfSquare(start,end));
	}

	public static int SquareOfSum(int start,int end){
		int result = 0;
		for(int i = start ; i <= end ; i++){
			result += i;
		} 
		return result*result ;
		
	}
	public static int SumOfSquare(int start,int end){
		int result = 0;
		for(int i = start ; i <= end ; i++){
			result += i * i ;
		}
		return result;		
	}
}
