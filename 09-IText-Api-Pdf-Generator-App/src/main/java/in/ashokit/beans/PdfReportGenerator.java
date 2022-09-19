package in.ashokit.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import in.ashokit.service.CourseService;


public class PdfReportGenerator {

	
	 public static void main(String args[]) {
		 
		 //using try with resource concept(which is introduced in java 1.7v)
		 //no need to use finally block ,wen v come out of try block its automatically it is going to close the file
	        try (OutputStream file=new FileOutputStream(new File("Contacts.pdf"))){
	            
	 
	            // Create a new Document object
	            // 1 pdf file is called as one document
	            
	            Document document = new Document();
	 
	            // You need PdfWriter to generate PDF document
	            PdfWriter.getInstance(document, file);
	 
	            // Opening document for writing PDF
	            document.open();
	 
	            // Writing content
	            document.add(new Paragraph("Hello World, Creating PDF document in Java is easy"));
	            document.add(new Paragraph("You are customer # 2345433"));
	            document.add(new Paragraph(new Date(new java.util.Date().getTime()).toString()));
	            
	            document.add(new Paragraph (" "));
	            
	            CourseService service=new CourseService();
	            List<Course> courses = service.getCourses();
	            
	            
	            PdfPTable table=new PdfPTable(2);
	            table.addCell("Course Name");
	            table.addCell("Timings");
	            
	            //for each row create 2 columns
	            courses.forEach(course -> {
	            	table.addCell(course.getCourseName());
		            table.addCell(course.getTimings());
	            	
	            });
	            
	           	            
	            document.add(table);	
	            
	                   // Add meta data information to PDF file
	            document.addCreationDate();
	            document.addAuthor("Ashok IT");
	            document.addTitle("How to create PDF document in Java");
	            document.addCreator("Thanks to iText, writing into PDF is easy");
	 
	 
	            // close the document
	            document.close();
	 
	            System.out.println("Your PDF File is succesfully created");
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	 
	        
	        }
	 
	    }
}
