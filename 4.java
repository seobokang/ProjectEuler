package testt;

import java.util.ArrayList;
import java.math.*;
public class tt {
	public static void main(String[] args){
		int i,j,k;
		int max = 0; 
		int count,data;
		String temp;
		for(i = 999 ; i > 0; i--){
			for(j = 999 ; j > 0 ; j--){
				data = i * j;
				temp = String.valueOf(data);
				for(k = 0 ; k < temp.length() / 2 ; k++){
					if(temp.charAt(k) != temp.charAt(temp.length() - k - 1 )){
						break;
					}
				}
				if(k == temp.length()/2){
					if(max < data){
						max = data;
						
					}
				}
					
			}
		}

		System.out.println(max);
		
	}
}
