package com.capgemini.listfiledirectories;

import java.io.File;
import java.util.Scanner;

public class ListFiles {

	public static void main(String args[]) {

		Scanner get = new Scanner(System.in);

		System.out.println("Enter file directory");
		String fileDirectory = get.next();// taking path from user

		File subdir = new File(fileDirectory);
		// using lambda expression
		File[] subDirectories = subdir.listFiles((file1) -> file1.isDirectory());

		// iterating each file element
		for (File dir : subDirectories) {
			System.out.println(dir.getName());
		}

		System.out.println("By another method");
		// using method expression
		File[] subDirectories1 = subdir.listFiles(File::isDirectory);
		// iterating each file element
		for (File dir : subDirectories1) {
			System.out.println(dir.getName());
		}

	}
}
