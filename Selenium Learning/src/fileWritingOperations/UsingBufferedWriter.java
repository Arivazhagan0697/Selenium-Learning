package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {

		String location = "C:\\Users\\91737\\Documents\\BufferOperations\\FileWrite.txt";
		String content = "Winter is coming!!! We will going to enjoy this winter";

		FileWriter writer = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		bufferedWriter.write(content);
		bufferedWriter.close();

	}

}
