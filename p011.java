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

		int Max = 0 ;

		for(int i = 0 ; i < DataList.size() - 3 ; i++){
			for(int j = 0 ; j < DataList.get(i).length ; j++){
				int verti = DataList.get(i+0)[j] * DataList.get(i+1)[j] *
					DataList.get(i+2)[j] * DataList.get(i+3)[j];
					if(verti > Max) Max = verti;

				if(j < DataList.get(i).length - 3){

					int hori = DataList.get(i)[j+0] * DataList.get(i)[j+1] * 
						DataList.get(i)[j+2] * DataList.get(i)[j+3] ;
					if(hori > Max) Max = hori;

					int diag1 = DataList.get(i+0)[j+0] * DataList.get(i+1)[j+1] *
						DataList.get(i+2)[j+2] * DataList.get(i+3)[j+3];
					if(diag1 > Max) Max = diag1;
				}

				
				if(j > 2){
					int diag2 = DataList.get(i)[j] * DataList.get(i+1)[j-1] *
						DataList.get(i+2)[j-2] * DataList.get(i+3)[j-3];
					if(diag2 > Max) Max = diag2;
				}

			}
		}

		System.out.println(Max);
		
	}	
	
}


