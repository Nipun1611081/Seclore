package com.seclore.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.seclore.util.ReadWriteCharStream;

public class ReadCharStreamMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReadWriteCharStream readWriteCharStream = new ReadWriteCharStream();
		File file = null;
		Reader reader = null;
		String filePath;
		char[] data;
		try {
			System.out.println("Reading file");
			System.out.println("Enter file path");
			filePath = scanner.next();
			System.out.println("Data from file");
			file = new File(filePath);
			reader = new FileReader(file);
			if (reader != null) {
				data = readWriteCharStream.readFileData(file, reader);

				for (char c : data) {
					System.out.print(c);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}

		finally {
			try {
				if (reader != null)
					reader.close();
				scanner.close();
				System.out.println("\n\n all resources are closed successfully !!");
			} catch (IOException e) {
				System.out.println("Unable to close the reader ");
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Unable to close the reader ");
				System.out.println(e.getMessage());
			}
		}
	}
}
