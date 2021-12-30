
import  java.io.*;  
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import  org.apache.poi.hssf.usermodel.HSSFRow;  

public class AddBooks {
	public static void main(String[] args) {
		try {
			// declare file name to be create
			String filename = "C:\\Demo.xls";
//creating an instance of HSSFWorkbook class  
			HSSFWorkbook workbook = new HSSFWorkbook();
//invoking creatSheet() method and passing the name of the sheet to be created   
			HSSFSheet sheet = workbook.createSheet("BooksInventory");
//creating the 0th row using the createRow() method  
			HSSFRow rowhead = sheet.createRow((short) 0);
//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
			rowhead.createCell(0).setCellValue("S.No.");
			rowhead.createCell(1).setCellValue("Bookname");
			rowhead.createCell(2).setCellValue("Author");
			rowhead.createCell(3).setCellValue("Publisher");
			rowhead.createCell(4).setCellValue("ISBNNUmber");
			rowhead.createCell(5).setCellValue("Category");
//rowhead.createCell(6).setCellValue("");
//creating the 1st row  
			HSSFRow row = sheet.createRow((short) 1);
//inserting data in the first row  
			row.createCell(0).setCellValue("1");
			row.createCell(1).setCellValue("java programming");
			row.createCell(2).setCellValue("herbert schieldt");
			row.createCell(3).setCellValue("oracle");
			row.createCell(4).setCellValue("123-456-778");
			row.createCell(5).setCellValue("programming");
//creating the 2nd row  
			HSSFRow row1 = sheet.createRow((short) 2);
//inserting data in the second row  
			row1.createCell(0).setCellValue("2");
			row1.createCell(1).setCellValue("intro to python");
			row1.createCell(2).setCellValue("van russel");
			row1.createCell(3).setCellValue("cengage");
			row1.createCell(4).setCellValue("23-234-543");
			row1.createCell(5).setCellValue("programming");
			HSSFRow row2 = sheet.createRow((short) 3);
//inserting data in the third row  
			row2.createCell(0).setCellValue("3");
			row2.createCell(1).setCellValue("paradise");
			row2.createCell(2).setCellValue("shakespeare");
			row2.createCell(3).setCellValue("xjgliu");
			row2.createCell(4).setCellValue("656-365-23146");
			row2.createCell(5).setCellValue("novels");
			HSSFRow row3 = sheet.createRow((short) 4);
//inserting data in the fourth row  
			row3.createCell(0).setCellValue("4");
			row3.createCell(1).setCellValue("vogue");
			row3.createCell(2).setCellValue("asdfs");
			row3.createCell(3).setCellValue("vogue");
			row3.createCell(5).setCellValue("magazine");
			row3.createCell(4).setCellValue("656-365-23146");
			
			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
//closing the Stream  
			fileOut.close();
//closing the workbook  
			workbook.close();
//prints the message on the console  
			System.out.println("Books are added.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
