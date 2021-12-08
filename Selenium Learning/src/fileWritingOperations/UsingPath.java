package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {

		String location = "C:\\Users\\91737\\Documents\\BufferOperations\\UsingPath.txt";
		String content = "Learning selenium is fun " + 
		                 "If you thought in a proper way";

		Path path = Paths.get(location);
		Files.write(path, content.getBytes());

	}

}
