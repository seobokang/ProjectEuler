import java.util.ArrayList;

public class p010 {
	public static void main(String[] args){
		int size = 2000000;
		long result = 2+3+5+7+11+13+17+19 ;
		int temp;
		ArrayList<Integer> DataList = new ArrayList<Integer>();
		for(int i = 2 ; i <= size ; i++){
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 
				&& i%11!=0 && i%13!=0 && i%17!=0 && i%19!=0)	DataList.add(i);
		}

		while(DataList.size() > 0){
			temp = DataList.get(0);
			//System.out.println(temp);
			result += temp;

			ArrayList<Integer> TempList = new ArrayList<Integer>();

			for(Integer i : DataList){
				if(i % temp == 0) TempList.add(i);
			}

			for(Integer i : TempList){
				DataList.remove(i);
			}
		}

		System.out.println(result);

	}

}
