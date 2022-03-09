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

	private static Sector choosePivot(ArrayList<Sector> array) {
		Sector value1 = new Sector(array.get(0));
		Sector value2 = new Sector(array.get(array.size()/2));
		Sector value3 = new Sector(array.get(array.size()-1));
		int valor = (value1.getScore() + value2.getScore() + value3.getScore()) / 3;
		int aux1 = Math.abs(value1.getScore() - valor);
		int aux2 = Math.abs(value2.getScore() - valor);
		int aux3 = Math.abs(value3.getScore() - valor);

		if (aux1 < aux2 && aux1 < aux3) {
			return value1;
		}

		if (aux2 < aux1 && aux2 < aux3) {
			return value2;
		}

		return value3;
	}
	
	public static void policiaDyV(ArrayList<Sector> array, int lowIndex, int highIndex) {
		// Choose a pivot
		Sector pivot = new Sector(choosePivot(array));
		
	}

	public static void main(String[] args) throws IOException {
		PoliciaDyV policia = new PoliciaDyV();
		policia.loadFile();

		Sector sector = new Sector(PoliciaDyV.choosePivot(policia.scoreDistrict));
		System.out.println(sector.toString());
		System.out.println("Primer elemento de la lista");
		System.out.println(policia.scoreDistrict.get(0));
		System.out.println("Elemento intermedio de la lista");
		System.out.println(policia.scoreDistrict.get(policia.scoreDistrict.size() / 2));
		System.out.println("Ultimo elemento de la lista");
		System.out.println(policia.scoreDistrict.get(policia.scoreDistrict.size()-1));
		System.out.println("-----");
		System.out.println(sector.equals(policia.scoreDistrict.get(0)));
		System.out.println(policia.scoreDistrict.contains(sector));
		System.out.println(policia.scoreDistrict.indexOf(sector));
		System.out.println("-----");
		System.out.println(sector.toString());
		System.out.println(policia.scoreDistrict.get(0).toString());

		
//		for (int position = 0; position < policia.scoreDistrict.size(); position++) {
//			System.out.println(policia.scoreDistrict.get(position));
//		}

	}

}