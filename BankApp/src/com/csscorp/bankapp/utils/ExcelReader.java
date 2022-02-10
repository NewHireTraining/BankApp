package com.csscorp.bankapp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	public static Object[][] read(String fileName, String sheetName) {

		Object[][] excelData = null;
		Workbook workbook = null;
		FileInputStream file = null;

		try {
			file = new FileInputStream(new File(fileName));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			if (fileName.endsWith("xls")) {
				workbook = new HSSFWorkbook(file);
			} else if (fileName.endsWith("xlsx")) {
				workbook = new XSSFWorkbook(file);
			} else {
				throw new UnsupportedEncodingException("File format not supported: Please use xls or xlsx format.");
			}
			int rowIndex = 0;

			Sheet sheet = workbook.getSheet(sheetName);
			int maxRow = sheet.getPhysicalNumberOfRows();
			int maxCol = sheet.getRow(0).getPhysicalNumberOfCells();
			excelData = new Object[maxRow][maxCol];
			System.out.println("Excel Reader initiated...");
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				int colIndex = 0;
				Row row = rowIterator.next();

				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {
					case NUMERIC:
						excelData[rowIndex][colIndex] = cell.getNumericCellValue();
						break;
					case STRING:

						excelData[rowIndex][colIndex] = cell.getStringCellValue();
						break;
					case BOOLEAN:
						excelData[rowIndex][colIndex] = cell.getBooleanCellValue();
						break;
					case FORMULA:
						excelData[rowIndex][colIndex] = cell.getCellFormula();
						break;
					default:
						excelData[rowIndex][colIndex] = "";
						break;
					}
					if (colIndex < maxCol - 1)
						colIndex++;
				}
				rowIndex++;
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (workbook != null)
					workbook.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Excel Read completed.");
		return excelData;
	}
}
