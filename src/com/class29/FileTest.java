package com.class29;

public class FileTest {
	public static void main(String[] args) {
		File javaFile= new JavaFile();
		javaFile.edit();
		javaFile.close();
		javaFile.open();
		System.out.println();
		
		File wordFile=new WordFile();
		wordFile.edit();
		wordFile.close();
		wordFile.open();
		System.out.println();
		
		File pdf=new PDFFile();
		pdf.edit();
		pdf.close();
		pdf.open();
	
	}

}
