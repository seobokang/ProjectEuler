import java.util.ArrayList;
public class p012{
	public static void main(String[] args){
		System.out.println(TriangularOfLeastDivisor(Integer.parseInt(args[0])));
	}
	public static int DivisorCount(int num){
		int count = 1;
		int i;

		ArrayList<Integer> BaseData = new ArrayList<>();
		ArrayList<Integer> ExponentData = new ArrayList<>();

		if (num == 1)
			return 1;

		while(num != 1){
			for(i = 2 ; num%i != 0 ; i++);
			num/=i;
			int pos = BaseData.indexOf(new Integer(i));
			if(pos != -1) {
				ExponentData.set(pos,ExponentData.get(pos)+1);
			}
			else {
				BaseData.add(new Integer(i));
				ExponentData.add(new Integer(1));
			}
		}

		for (Integer j : ExponentData){
			count *= (j+1);
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
			System.out.printf("%40d%10d%10d%10d\n",TriangularNum,i,dnum,max);
		}
		return TriangularNum;
	}
}
