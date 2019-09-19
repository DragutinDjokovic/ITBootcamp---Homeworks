package domaciRad06092019;

public class GlavniExcel {

	public static void main(String[] args) {
		ExcelUtils.setExcell("Data (DOM).xls");
		ExcelUtils.setWorkSheet(0);
		ExcelUtils.setDataAt(0, 1, "123");
		Integer result = Integer.valueOf(123);
		System.out.println(result);
		ExcelUtils.closeExcell();
		
	}

}
