public class p002 {
	public static void main(String[] args){
		int fib = 0;
		int i=1,j=2,t;
		while(j < 4000000){
			if(j%2 == 0){
				fib += j;	
			}
			t = j;
			j += i;
			i = t;
		}
		System.out.println(fib);
	}
}
