package com.alex.designmodes.create.fc;

public class Client {
	public static void main(String[] args) {
		ExportFactory fac1 = new ExportHtmlFactory();
		ExportFile f1 = fac1.factory();
		f1.export("哈哈");
		System.out.println("---------------------------------");
		ExportFactory fac2 = new ExportPdfFactory();
		ExportFile f2 = fac2.factory();
		f2.export("呵呵");
	}
}
