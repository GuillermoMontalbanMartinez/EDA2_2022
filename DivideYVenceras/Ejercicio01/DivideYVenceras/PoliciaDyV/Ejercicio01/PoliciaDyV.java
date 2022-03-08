package DivideYVenceras.PoliciaDyV.Ejercicio01;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PoliciaDyV {
	private ArrayList<Sector> scoreDistrict;
	
	public PoliciaDyV() {
		this.scoreDistrict = new ArrayList<Sector>();
	}
	/**
	 * Load the data of the file in our struct:
	 * 	1. The first line of the file helps us to calculate the number of elements
	 * 	2. Save in the struct the sector with position i, position j and score each sector
	 * @throws IOException
	 */
	public void loadFile() throws IOException {
		File fileScore = new File("/Users/guillermo/eclipse-workspace/EstructuraDeDatos2/ejercicios/org/eda2/ejercicio1/district10.txt");
		BufferedReader obj = new BufferedReader(new FileReader(fileScore));
		
		int n = Integer.parseInt(obj.readLine());
		int rowCol = (int) Math.pow(2, n);
		for (int i = 0; i < rowCol; i++) {
			for (int j = 0; j < rowCol; j++) {
				int score = Integer.parseInt(obj.readLine());
				Sector sector = new Sector(i+1, j+1, score);
				this.scoreDistrict.add(sector);
			}
		}
		
		obj.close();
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		PoliciaDyV policia = new PoliciaDyV();
		policia.loadFile();
		
		for (int position = 0; position < policia.scoreDistrict.size(); position++) {
			System.out.println(policia.scoreDistrict.get(position));
		}
		

	}

}