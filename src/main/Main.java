package main;

import java.io.*;

import gui.MainWindow;

public class Main {

	public static void main(String[] args) throws IOException {
		Pies.utworzPlik();
		Kot.utworzPlik();
		User.utworzPlik();
		MainWindow.main(args);
	}
}