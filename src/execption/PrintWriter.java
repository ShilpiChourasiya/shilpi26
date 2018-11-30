package execption;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter {
	public static void main(String[] args) throws IOException  {
		

			String content = "This is the content to write into file............";

			File file = new File("C:/Users/HP/Desktop/abnn.txt");

			// if file doesn't exists, then create it
			if (!file.exists()) {
				System.out.println("File not found , so creating a new file ");
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		}
	}
