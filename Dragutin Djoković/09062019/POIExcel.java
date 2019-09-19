package domaciRad06092019;

import java.io.File;
import java.io.FileInputStream;
//import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class POIExcel {

	public static void main(String[] args) {
		try {
			File src = new File("Data (DOM).xls");
			FileInputStream fis = new FileInputStream(src);
			HSSFWorkbook wbe = new HSSFWorkbook(fis);
			HSSFSheet sheet0 = wbe.getSheetAt(0);
			int rowcount = sheet0.getLastRowNum();

			int sum = 0;
			for (int i = 0; i <= rowcount; i++) {
				HSSFRow r = sheet0.getRow(i);
				if (r != null) {
					double data = r.getCell(0).getNumericCellValue();
					sum += data;
				} else {
					System.out.println("<Empty row>");
				}
			}
			System.out.println("Zbir vrednosti redova kolone je: " + sum);
			wbe.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
