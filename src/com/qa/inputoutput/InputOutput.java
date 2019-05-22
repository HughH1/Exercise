package com.qa.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {

	public static void main(String[] args) {

		try {
			throw new IOBrokenException();
		} catch (IOBrokenException ian) {
			System.out.println(ian.toString());
		}

		// throw new ArithmeticException();

		// BufferedReader bfdRead = new BufferedReader(new
		// FileReader("C:/Users/Admin/Desktop/inText.txt"));
		//
		// String line = bfdRead.readLine();
		//
		// while (line != null) {
		//
		// System.out.println(line);
		// line = bfdRead.readLine();
		//
		// }
		//
		// BufferedWriter bfdWrite = new BufferedWriter(new
		// FileWriter("C:/Users/Admin/Desktop/outText.txt"));
		// bfdWrite.write("new line" + "\r\n");
		// bfdWrite.write("yay!" + "\r\n");
		// bfdWrite.flush();
		// bfdWrite.close();

		// try {
		// int num = 3 / 0;
		// } catch (ArithmeticException e) {
		// System.out.println("Reeeee");
		// System.out.println(e.getStackTrace());
		// }
	}

}
