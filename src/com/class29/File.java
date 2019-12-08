package com.class29;

public abstract class File {
	public abstract void open();

	void edit() {
		System.out.println("Implemented method");
	}

	void close() {
		System.out.println("Implenmented method");
	}

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open Java file we need Notepad++");
	}

}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("To open .doc file we need Microsfot Word");
	}

}

class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("To open pdf file we need PDF reader");

	}

}
