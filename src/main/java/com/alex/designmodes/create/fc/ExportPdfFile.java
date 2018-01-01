package com.alex.designmodes.create.fc;

public class ExportPdfFile implements ExportFile {

	@Override
	public void export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出了pdf文件:"+data);
	}

}
