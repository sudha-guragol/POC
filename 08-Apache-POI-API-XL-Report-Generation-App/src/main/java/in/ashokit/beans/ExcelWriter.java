package in.ashokit.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	
	//1 xl file is called as one workbook in POI Api
	public static void main(String[] args) throws Exception  {
		
		
		Emp e1=new Emp("101","nitin","2000");
		Emp e2=new Emp("102","akash","3000");
		Emp e3=new Emp("103","banni","5000");
		Emp e4=new Emp("104","uma","4000");
		Emp e5=new Emp("105","leela","6000");
		Emp e6=new Emp("106","wajid","7000");
		
		List<Emp> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		
		ExcelWriter writer=new ExcelWriter();
		writer.write(empList);
	}
	public void write(List<Emp> empList) throws Exception
	{
		Workbook workbook=new XSSFWorkbook();
	Sheet sheet= workbook.createSheet("Emps");
	//in sheet row will be created(header row)
	Row headerRow=sheet.createRow(0);
	
	//in headerrow 3 cells will be created
	Cell headerCell0 = headerRow.createCell(0);
	Cell headerCell1 = headerRow.createCell(1);
	Cell headerCell2 = headerRow.createCell(2);
	
	
	//setting cell values
	headerCell0.setCellValue("Emp Id");
	headerCell1.setCellValue("Emp Name");
	headerCell2.setCellValue("Emp Salary");
	
	
	//below slogic will work for any no of data
	//it will take obj from emp collection and will create a row and set data to cells row
	for(int i=0;i<empList.size();i++)
	{
		//data will be stored from second row(I+1)
		Row dataRow=sheet.createRow(i+1);
		
		//in row 3 cells will be created
		//creating second row to add data
		Cell dataCell0 = dataRow.createCell(0);
		Cell dataCell1 = dataRow.createCell(1);
		Cell dataCell2 = dataRow.createCell(2);
		
		Emp emp=empList.get(i);
		
		//setting cell values
		dataCell0.setCellValue(emp.getEmpId());
		dataCell1.setCellValue(emp.getEmpName());
		dataCell2.setCellValue(emp.getEmpSalary());	
	}
	
	//with FileOutputStream creatring one file
	FileOutputStream fos=new FileOutputStream(new File("Emps.xlsx"));
	
	//workbook will write data to workbook
	workbook.write(fos);
	workbook.close();
	}

}
