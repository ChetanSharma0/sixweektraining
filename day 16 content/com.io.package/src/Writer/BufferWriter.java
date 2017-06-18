package Writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	
	public static void main(String[] args) {
		
try {
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("x"));

bufferedWriter.write("first line");
bufferedWriter.newLine();
bufferedWriter.write("second line");
bufferedWriter.flush();
bufferedWriter.close();









} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
