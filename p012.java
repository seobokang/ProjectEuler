public class p012{
	public static void main(String[] args){
		System.out.println(TriangularOfLeastDivisor(Integer.parseInt(args[0])));
	}
	public static int DivisorCount(int num){
		int count = 0;
		for(int i = 1 ; i <= num ; i++){
			if(num%i == 0) count++;
		}
		return count;
	}
	public static int TriangularOfLeastDivisor(int LeastDivisor){
		int dnum = 0 ;
		int TriangularNum = 0;
		int max = 0; 
		for(int i = 1 ; dnum < LeastDivisor ; i++){
			TriangularNum += i;
			dnum = DivisorCount(TriangularNum);
			if (dnum > max) max = dnum;
			System.out.printf("%40d%10d%10d\n",TriangularNum,dnum,max);
		}
		return TriangularNum;
	}
}
