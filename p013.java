import java.io.*;
public class p013{
	public static void main(String args[]){
		String filename = "p013_data.txt";
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));
			String FileStrLine;
			while((FileStrLine = in.readLine()) != null){
				
			}
		}catch (IOException e){
			System.err.println(e);
			System.exit(1);
		}
	}
}
