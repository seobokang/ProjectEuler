public class p7{
	public static void main(String[] args){
		int WantToCount = 10001;
		int counter = 0;
		int i;
		for(i = 2; counter < WantToCount ; i++){
			if(CheckPrime(i)) counter++;
		}
		System.out.println(--i);
	}
	public static boolean CheckPrime(int num){
		if(num == 2) return true;
		for(int i = 2; i < num ; i++){
			if(num%i==0) return false;
		}
		return true;
	}
}
