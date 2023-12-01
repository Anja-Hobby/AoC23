package Basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class AoCReader {

	
	public static ArrayList<String> read(String LocatieString) throws Exception {
		File aocDag1 = new File(LocatieString); 
		BufferedReader br = new BufferedReader(new FileReader(aocDag1));
		ArrayList<String> regels = new ArrayList<>();
		String ss;
		while ((ss=(String) br.readLine())!= null) {
			regels.add(ss);
		}
		br.close();
		return regels;
	}	
}