public class p012{
	public static void main(String[] args){
		System.out.println(CaseNumTriangular(Integer.parseInt(args[0])));
	}
	public static int DivisorNum(int num){
		int count = 0;
		for(int i = 1 ; i <= num ; i++){
			if(num%i == 0) count++;
		}
		return count;
	}
	public static int CaseNumTriangular(int ListDivisor){
		int dnum = 0 ;
		int TriangularNum = 0;
		int max = 0; 
		for(int i = 1 ; dnum < ListDivisor ; i++){
			TriangularNum += i;
			dnum = DivisorNum(TriangularNum);
			if (dnum > max) max = dnum;
			System.out.printf("%40d%10d%10d\n",TriangularNum,dnum,max);
		}
		return TriangularNum;
	}
}
