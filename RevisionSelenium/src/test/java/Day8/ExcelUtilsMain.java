package Day8;

public class ExcelUtilsMain {
	public static void main(String[] args) {
		 String projectPath=System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath+"\\Excel\\data.xlsx", "sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
	}

}
