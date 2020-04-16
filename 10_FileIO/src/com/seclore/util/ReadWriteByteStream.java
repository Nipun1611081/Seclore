package com.seclore.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadWriteByteStream {

	private byte[] data;

	public int share() {
		return 245;
	}

	public byte[] readFile(File file, InputStream inputStream) throws IOException {
		data = new byte[(int) file.length()];
		inputStream.read(data);
		return data;
	}

	public void writeFile(OutputStream outputStream, byte[] data) throws IOException {
		outputStream.write(data);
	}

}
