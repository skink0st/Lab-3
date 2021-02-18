import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class GraphIO implements Graph {
	
	static public void readFile(Graph g, String filename) throws IOException {
		try {
			
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			int numOfNodes = scanner.nextInt();
			int Node = 0;
			
			while (Node < numOfNodes) {
				int id0 = scanner.nextInt();
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				g.addNode(id0, x, y);
				Node++;
			}
			while (scanner.hasNextInt()) {
				int id2 = scanner.nextInt();
				int x2 = scanner.nextInt();
				int y2 = scanner.nextInt();
				System.out.println("" + id2 + "" + x2 + "" + y2);
				
				g.addEdge(id2, x2, y2);
			}
			scanner.close();
		} catch (Exception e) {
			throw new IOException("Error");
		}
		
		
	}
	public void addNode(int id0, int x, int y) throws NoSuchElementException {
		
	}
	public void addEdge(int id2, int x2, int y2) {
		
	}
}
