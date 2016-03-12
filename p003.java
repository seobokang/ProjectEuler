import java.util.ArrayList;

public class p003 {

        static public boolean check_prime(int num){
                for(int i = 2 ; i < num ; i++){
                        if(num % i == 0) return false;
                }
                return true;
        }


	public static void main(String[] args){
		long in = 600851475143L;
		int i = 2;
		
		while(in != 1){
			if((in % i == 0) && (check_prime(i) == true)){
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
