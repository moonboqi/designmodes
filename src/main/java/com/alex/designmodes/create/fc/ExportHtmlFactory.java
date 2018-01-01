package com.alex.designmodes.create.fc;

public class ExportHtmlFactory implements ExportFactory {

	@Override
	public ExportFile factory() {
		// TODO Auto-generated method stub
		return new ExportHtmlFile();
	}





}
