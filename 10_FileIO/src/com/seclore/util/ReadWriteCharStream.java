package com.seclore.util;

import java.io.File;
import java.io.IOException;
import java.io.Reader;

public class ReadWriteCharStream {

	private char[] data;

	public char[] readFileData(File file, Reader reader) throws IOException {
		data = new char[(int) file.length()];
		reader.read(data);
		return data;
	}

}
