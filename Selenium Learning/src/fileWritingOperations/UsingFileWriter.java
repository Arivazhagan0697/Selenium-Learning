package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		
		String location = "C:\\Users\\91737\\Documents\\BufferOperations\\UsingFileWriter.txt";
		String content = "Learning selenium is simple";
		
		FileWriter writer =new FileWriter(location);
		writer.write(content);
		writer.close();
	
	}

}
