package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsinfBufferedReader {

	public static void main(String[] args) throws IOException {

		String location = "C:\\Users\\91737\\Documents\\BufferOperations\\FileRead.txt";

		FileReader fileReader = new FileReader(location);

		BufferedReader Reader = new BufferedReader(fileReader);

		String currentline;

		while ((currentline = Reader.readLine()) != null) {
			System.out.println(currentline);
		}

	}

}
