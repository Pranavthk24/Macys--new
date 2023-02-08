/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com.company;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author pranav
 */
public class FileUtil {

    public static ContactUS readForm() throws Exception {
        ContactUS contactus = null;
        FileInputStream inputStream = new FileInputStream(new File("c:\\data\\form_macy.xlsx"));
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet contact = workbook.getSheetAt(0);
        Row r = contact.getRow(0);
        Cell c = r.getCell(1); //first name
        String firstname = c.getStringCellValue();
        System.out.println("fname=" + firstname);

        r = contact.getRow(1);
        c = r.getCell(1); //last name
        String lastname = c.getStringCellValue();
        System.out.println("lname=" + lastname);

        r = contact.getRow(2);
        c = r.getCell(1); //address1
        String address1 = c.getStringCellValue();
        System.out.println("address1=" + address1);

        r = contact.getRow(3);
        c = r.getCell(1); //zip
        String zip = c.getNumericCellValue() + "";
        System.out.println("zip=" + zip);
        
        r = contact.getRow(4);
        c = r.getCell(1); //state
        String state = c.getStringCellValue();
        System.out.println("state=" + state);
        
        r = contact.getRow(5);
        c = r.getCell(1); //city
        String city = c.getStringCellValue();
        System.out.println("city=" + city);
        
        r = contact.getRow(6);
        c = r.getCell(1); //phone
        String phone = c.getNumericCellValue() + "";
        System.out.println("phone=" + phone);

        contactus = new ContactUS(firstname, lastname, address1, zip, state, city, phone);
        return contactus;

    }
}
