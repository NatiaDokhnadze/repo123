package service;

import model.Product;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.List;

public class SwoopExcelExportService {

    private static final String FILE_PATH = "src/main/resources/swoop_kids_products.xlsx";

    public void writeProductsToExcel(List<Product> products) {
        Workbook workbook;
        Sheet sheet;

        File file = new File(FILE_PATH);
        boolean isNewFile = !file.exists();

        try {
            if (isNewFile) {
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Kids Products");

                Row header = sheet.createRow(0);
                header.createCell(0).setCellValue("Title");
                header.createCell(1).setCellValue("Description");
                header.createCell(2).setCellValue("Price");
                header.createCell(3).setCellValue("Discount %");
                header.createCell(4).setCellValue("Sold Quantity");
            } else {
                FileInputStream fis = new FileInputStream(FILE_PATH);
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheetAt(0);
            }

            int rowCount = sheet.getLastRowNum();

            for (Product p : products) {
                Row row = sheet.createRow(++rowCount);
                row.createCell(0).setCellValue(p.getTitle());
                row.createCell(1).setCellValue(p.getDescription());
                row.createCell(2).setCellValue(p.getPrice());
                row.createCell(3).setCellValue(p.getDiscountPercentage());
                row.createCell(4).setCellValue(p.getSoldQuantity());
            }

            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            workbook.write(fos);
            workbook.close();
            fos.close();

            System.out.println(" Excel Export Completed: " + FILE_PATH);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
