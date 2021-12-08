package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {

		String location = "C:\\Users\\91737\\Documents\\BufferOperations\\UsingFOS.txt";
		String content = "Share this code if you like this!!!";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		outputStream.write(writeThis);
		outputStream.close();

	}

}
