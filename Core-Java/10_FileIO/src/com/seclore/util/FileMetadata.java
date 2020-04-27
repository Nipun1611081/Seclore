package com.seclore.util;

import java.io.File;
import java.util.Date;

public class FileMetadata {
	public void printMetadata(File file) {
		System.out.println("Name of File :: " + file.getName());
		System.out.println("Size of File :: " + file.length() + " bytes");
		System.out.println("Location of File :: " + file.getAbsolutePath());
		System.out.println("Can write the File :: " + file.canWrite());
		System.out.println("Can read the File :: " + file.canRead());
		System.out.println("Can execute the File :: " + file.canExecute());
		System.out.println("Last Modified Date and Time " + new Date(file.lastModified()));
	}
}
