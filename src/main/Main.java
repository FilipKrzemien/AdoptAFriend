package main;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Pies.utworzPlik();
		Kot.utworzPlik();
		MainWindow.main(args);
	}
}