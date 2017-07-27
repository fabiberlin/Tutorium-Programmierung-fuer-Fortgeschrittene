import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MatrixReader {
	


	public static void main(String[] args) {
		
		int[][] matrix = null;
		
		// Read File
		try (BufferedReader br = new BufferedReader(new FileReader(new File("src/zahlen.txt")))) {
		    String line;
		    int dimension = 0;
		    int i = 0;
		    while ((line = br.readLine()) != null) {
		    	int number = Integer.parseInt(line, 10);
		    	if (matrix == null) {
		    		dimension = number;
					matrix = new int[dimension][dimension];
				}else{
					matrix[i % dimension][i / dimension] = number;
					i++;										
				}
		    }
		    
		
		    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		//Find Minimum
		int min = Integer.MAX_VALUE;
		if (matrix != null) {
			for (int y = 0; y < matrix.length; y++) {
				for (int x = 0; x < matrix.length; x++) {
					if (matrix[x][y] < min) {
						min = matrix[x][y];
					}
				}
			}
		}
		System.out.println("Min: " + min);
		
		//Print Matrix
		if (matrix != null) {
			for (int y = 0; y < matrix.length; y++) {
				for (int x = 0; x < matrix.length; x++) {
					System.out.print(matrix[x][y] + " ");
				}
				System.out.print("\n");
			}
		}
	}
}
