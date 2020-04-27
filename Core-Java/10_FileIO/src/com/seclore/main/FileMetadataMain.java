package com.seclore.main;

import java.io.File;
import java.util.Scanner;

import com.seclore.util.FileMetadata;

public class FileMetadataMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileMetadata fileMetadata = new FileMetadata();
		String path;

		System.out.println("Enter path of file to print metadata");
		path = scanner.next();
		File file = new File(path);
		fileMetadata.printMetadata(file);

		System.out.println("------------------------------------");
		scanner.close();

	}
}
