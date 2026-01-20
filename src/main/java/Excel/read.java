package Excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {
	public static String[][] readExcel(int sheet, int row, int column) throws Exception {
		String[][] testData = null;
		String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\data.xlsx";
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheetAt(sheet);
		testData = new String[row][column];
		for (int i = 0; i <=ws.getLastRowNum(); i++) {
			Row r = ws.getRow(i);
			for (int j = 0; j < r.getLastCellNum(); j++) {
				testData[i][j] = String.valueOf(ws.getRow(i).getCell(j));
				
				//System.out.println(testData[i][j]);
			}
		}
		wb.close();
		return testData;
	}
}