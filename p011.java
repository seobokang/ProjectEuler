import java.io.*;
import java.util.ArrayList;

public class p011{
	public static void main(String args[]){
		String filename = "p011_data.txt";
		ArrayList<Integer[]> DataList = new ArrayList<Integer[]>();

		try{
			BufferedReader in = new BufferedReader(new FileReader(filename));
			String FileStrLine; 
			while((FileStrLine = in.readLine()) != null){
				
				String[] FileStrLine_Split = FileStrLine.split(" ");
				Integer[] DataListLine = new
					Integer[FileStrLine_Split.length];
				DataList.add(DataListLine);

				for(int i = 0 ; i < FileStrLine_Split.length ; i++ ){
					DataListLine[i] = Integer.parseInt(FileStrLine_Split[i]);
				}
			}
			in.close();
		} catch (IOException e){
			System.err.println(e);
			System.exit(1);
		}

		for(int i = 0 ; i < DataList.size() ; i++){
			for(int j = 0 ; j < DataList.get(i).length ; j++){
				System.out.print(DataList.get(i)[j]+"--");
			}
			System.out.println();
		}
	}	
}


