package com.dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenUsingApachePOI {
	private static void readExcelUsingForLoop() throws IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\91824\\eclipse-workspace\\"
				+ "MavenProject\\src\\test\\java\\com\\dataDriven\\Book1.xlsx"); //location of the excel file
		Workbook workbook=new XSSFWorkbook(excel); //name of the book to work in file path
		Sheet sheet = workbook.getSheetAt(0); //index of sheet to work
		int rows = sheet.getPhysicalNumberOfRows();//size of rows
	//	sheet.getLastRowNum();
		for(int i=0; i<rows; i++) {
			Row r = sheet.getRow(i);
			int columns = r.getPhysicalNumberOfCells();
			for(int j=0; j<columns; j++) {
				Cell cols = r.getCell(j);
				CellType type = cols.getCellType(); 
				if (type.equals(CellType.STRING)) {
					String stringValue = cols.getStringCellValue();
					System.out.println(stringValue);

				} else if (type.equals(CellType.NUMERIC)) { 
					double numricValue =  cols.getNumericCellValue(); 
					int value=(int) numricValue;
					System.out.println(value); 
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		readExcelUsingForLoop();
	}
}


		
//		private static void readExcelUsingIterator() throws IOException {
//			FileInputStream excel=new FileInputStream("F:\\Testing\\data.xlsx");
//			Workbook workbook=new XSSFWorkbook(excel);
//			Sheet sheet = workbook.getSheetAt(0);
//			Iterator<Row> rowValues = sheet.iterator();
//			while (rowValues.hasNext()) {
//				Row row = rowValues.next();
//				Iterator<Cell> columnValues = row.iterator();
//				while (columnValues.hasNext()) {
//					Cell cell = columnValues.next();
//					CellType type = cell.getCellType(); 
//					if (type.equals(CellType.STRING)) {
//						String stringValue = cell.getStringCellValue();
//						System.out.println(stringValue);
//
//					} else if (type.equals(CellType.NUMERIC)) { 
//						double numricValue =  cell.getNumericCellValue(); 
//						int value=(int) numricValue;
//						System.out.println(value); 
//					}
//				}
//			}
//
//			/* to get single data
//			 * Row row = sheet.getRow(1); Cell cell = row.getCell(1);
//			 */
//
//
//			workbook.close();
//		}
//
//		public static void main(String[] args) throws IOException {
//			readExcelUsingIterator();
//			readExcelUsingForLoop();
//			}
//
//	}
//
//}
