public class p005{
	
	public static void main(String[] args){
		int first = 1;
		int last = 20;
		int num = last;
		int i ;
		while(true){

			for(i = first ; i <= last ; i++){
				if(num % i != 0)
					break;
                	}
			if(i == last+1) break;
			num++;
		}
		System.out.println(num);

	}
}
