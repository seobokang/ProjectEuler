import java.util.ArrayList;

public class p3 {
	public static void main(String[] args){
		long in = 600851475143L;
		int i = 2;
		
		while(in != 1){
			if(in % i == 0){
				in /= i;
				System.out.println(i);
				i = 2;
			}
			else{
				i++;
			}
		}
		
	}
}
