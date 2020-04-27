package com.seclore.util;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadWriteCharStream {

	private char[] data;

	public char[] readFileData(File file, Reader reader) throws IOException {
		data = new char[(int) file.length()];
		reader.read(data);
		return data;
	}

	public void writeFile(Writer writer, char[] data) throws IOException {
		writer.write(data);
	}

}
