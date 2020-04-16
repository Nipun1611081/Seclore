package com.seclore.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import com.seclore.util.ReadWriteCharStream;

public class WriteCharStreamMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReadWriteCharStream readWriteCharStream = new ReadWriteCharStream();
		Writer writer = null;
		File file = null;
		String filePath;

		String strData;
		try {
			System.out.println("Enter data for file");
			strData = scanner.nextLine();

			System.out.println("Enter File Path");
			filePath = scanner.next();
			file = new File(filePath);

			writer = new FileWriter(file);

			readWriteCharStream.writeFile(writer, strData.toCharArray());

			System.out.println("Please check your path and file !!");
		} catch (IOException e) {
			System.out.println("In catch");
			System.out.println("IOException :: " + e.getMessage());
		} finally {
			System.out.println("in finally");
			try {
				scanner.close();
				if (writer != null)
					writer.flush();
					writer.close();
			} catch (IOException e) {
				System.out.println("IO Exception Unable to close writer :: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Exception Unable to close writer :: " + e.getMessage());

			}
		}

	}
}
