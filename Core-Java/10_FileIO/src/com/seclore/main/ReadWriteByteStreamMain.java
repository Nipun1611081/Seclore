package com.seclore.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import com.seclore.util.ReadWriteByteStream;

public class ReadWriteByteStreamMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		File file = null;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		ReadWriteByteStream readWriteByteStream = new ReadWriteByteStream();
		String path, data;

		try {
			System.out.println("Enter Data for file");
			data = scanner.nextLine();

			System.out.println("Enter File Path ");
			path = scanner.next();

			file = new File(path);

			outputStream = new FileOutputStream(file);
			readWriteByteStream.writeFile(outputStream, data.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException :: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException :: " + e.getMessage());
		} finally {
			try {
				scanner.close();
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException e) {
				System.out.println("IOException :: " + e.getMessage());
			}
		}
		System.out.println("------------------------------------------------------");
		try {
			inputStream = new FileInputStream(file);
			data = new String(readWriteByteStream.readFile(file, inputStream));
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException :: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException :: " + e.getMessage());
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				System.out.println("IOException :: " + e.getMessage());
			}
		}
	}

}
