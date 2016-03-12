public class p009 {
	public static void main(String[] args){
		boolean check = true;
		int i,j;
		int result = 0;
		for (i = 1 ; (check==true) && (i < 1000); i++){
			for(j = i+1 ; _C(i,j) + i + j <= 1000 ; j++){
				if(CheckPythagoras(i,j) && (i+j+_C(i,j))==1000) {
					check = false;
					result = i * j * _C(i,j);
					break;
				}
			}
		}

		System.out.println(result);
	}
	public static boolean SquareCheck(int data){
		int CheckNum = (int)Math.sqrt((double)data);
		return CheckNum*CheckNum == data ? true : false ;
	}
	public static boolean CheckPythagoras(int a,int b){
		return SquareCheck((a*a)+(b*b));
	}
	public static int _C(int a, int b){
		return (int)Math.sqrt((a*a)+(b*b));
	}
}
