package Day5;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadToFile {
    public static void main(String[] args) {

        try (
                FileInputStream file = new FileInputStream("Data.xlsx");
                Workbook workbook = new XSSFWorkbook(file))
        {
            Sheet sheetDataLogin = workbook.getSheetAt(0);
            DataFormatter dataFormatter = new DataFormatter();

            for (Row row : sheetDataLogin) {
                if (row.getRowNum() == 0) continue;

                String username = dataFormatter.formatCellValue(row.getCell(3)).trim();
                String password = dataFormatter.formatCellValue(row.getCell(4)).trim();

                if (!username.isEmpty() || !password.isEmpty()) {
                    System.out.println("Username: " + username);
                    System.out.println("Password: " + password);
                }
            }

        } catch (Exception e) {
            System.err.println("Da xay ra loi" + e);
        }
    }
}
