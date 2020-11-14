package com.company.depinv;

// import java.io.FileWriter;
import java.io.IOException;
// import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file

	//? By transferring the creation of the Formatter and Writer objects to the client that will call this method
	public void writeMessage(
		Message msg,
		Formatter formatter,
		PrintWriter writer
		) throws IOException {
		
		writer.println(formatter.format(msg)); //formats and writes message
		writer.flush();

	}
}
