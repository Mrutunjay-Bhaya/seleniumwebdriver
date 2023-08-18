package dataSupplier;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utilities.XLUtilities;

public class DataSupplyFiled {
	
	@DataProvider(name="DataForCreateControl")
	public String[][] dataforOndemandControl()throws Throwable
	{
		String[][]data=new String[][]
				{{"Ondemand Field Image Evidence Control","Ondemand Field Image Description","Field","Field Ondemand evidence","1"},
				{"Ondemand Field Image Evidence and Numeric Control","Ondemand Field Image and Numeric Description" ,"Field", "Field Ondemand evidence","2"},
				{"Ondemand Field Text Evidence Control","Ondemand Field Text Description","Field","Field Ondemand evidence","5"}};
				 
				return data;		
	}
	@DataProvider(name="ClickOnCreateControl")
	public String[][]directCreateClick()throws Throwable
	{
		String[][]data=new String[][]
				{{"Ondemand Field Image Evidence Control","Ondemand Field Image Description","Field","Field Ondemand evidence","1"}};
				return data;
	}
	@DataProvider(name="ClickOnCreateWithoutControlName")
	public String[][]CreateWithoutControlName()throws Throwable
	{
		String[][]data=new String[][]
				{{"Ondemand Field Image Evidence Control","Ondemand Field Image Description","Field","Field Ondemand evidence","1"}};
				return data;
	}
	@DataProvider(name="ClickOnCreateWithoutDescription")
	public String[][]CreateWithoutDescription()throws Throwable
	{
		String[][]data=new String[][]
				{{"Ondemand Field Image Evidence Control","Ondemand Field Image Description","Field","Field Ondemand Evidence","1"}};
				return data;
	}
	@DataProvider(name="ClickOnCreateWithoutEvidenceCaptured")
	public String[][]CreateWithoutEvidenceCaptured()throws Throwable
	{
		String[][]data=new String[][]
				{{"Ondemand Field Image Evidence Control","Ondemand Field Image Description","Field","Field Ondemand Evience","1"}};
				return data;
	}
	
	@DataProvider(name="ClickOnCreateWithoutAcceptableEvidence")
	public String[][] createWithoutAcceptableEvidence() throws Throwable
	{
		String[][] data = new String[][] 
			   {{"Ondemand Field Image Evidence Control", "Ondemand Field Image Description", "Field", "Field OnDemand Evidence", "2"}};
			   return data;
	}
	@DataProvider(name="ClickOnCreateWithoutType")
	public String[][] createWithoutType() throws Throwable
	{
		String[][] data = new String[][] 
			   {{"Ondemand Field Image Evidence Control", "Ondemand Field Image Description", "Field", "Field OnDemand Evidence", "5"}};
			   return data;
	}
	@DataProvider(name="CreateControl")
	public String[][]dataforcreatecontrolField()throws IOException
	{
		String path="C:\\Users\\137548\\eclipse-workspace\\FieldAuditManagmentSystem\\ExcelFile\\ams_automation (7).xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet1");
		int colcount=XLUtilities.getCellCount(path, "Sheet1", 1);
		String createcontrol[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createcontrol[i-1][j]=XLUtilities.getCellData(path, "Sheet1", i, j);
			}
		}
		return createcontrol;
	}
	@DataProvider(name="AuditProcesswithOneControlforField")
	public String[][]dataForCreateAuditProcessField_2()throws IOException
	{
		String path="C:\\Users\\137548\\eclipse-workspace\\FieldAuditManagmentSystem\\ExcelFile\\ams_automation (7).xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet2");
		int colcount=XLUtilities.getCellCount(path, "Sheet2", 1);
		String createcontrol[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createcontrol[i-1][j]=XLUtilities.getCellData(path, "Sheet2", i, j);
			}
		}
		return createcontrol;
	}
	@DataProvider(name="AuditProcesswithTwoControlforField")
	public String[][]dataForCreateAuditProcessTwoControlField()throws IOException
	{
		String path="C:\\Users\\137548\\eclipse-workspace\\FieldAuditManagmentSystem\\ExcelFile\\ams_automation (7).xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet3");
		int colcount=XLUtilities.getCellCount(path, "Sheet3", 1);
		String createcontrol[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createcontrol[i-1][j]=XLUtilities.getCellData(path, "Sheet3", i, j);
			}
		}
		return createcontrol;
	}
	@DataProvider(name="AuditProcesswithThreeControlforField")
	public String[][]dataForCreateAuditProcesshreeControlField()throws IOException
	{
		String path="C:\\Users\\137548\\eclipse-workspace\\FieldAuditManagmentSystem\\ExcelFile\\ams_automation (7).xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet4");
		int colcount=XLUtilities.getCellCount(path, "Sheet4", 1);
		String createcontrol[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createcontrol[i-1][j]=XLUtilities.getCellData(path, "Sheet4", i, j);
			}
		}
		return createcontrol;
	}
	@DataProvider(name="ScheduleProcessforField")
	public String[][]dataForcreateScheduleProcess()throws IOException
	{
		String path="C:\\Users\\137548\\eclipse-workspace\\FieldAuditManagmentSystem\\ExcelFile\\ams_automation (7).xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet5");
		int colcount=XLUtilities.getCellCount(path, "Sheet5", 1);
		String createcontrol[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createcontrol[i-1][j]=XLUtilities.getCellData(path, "Sheet5", i, j);
			}
		}
		return createcontrol;
	}
	@DataProvider(name="AuditProcesswithOneControlforField")
	public String[][]dataForCreateAuditProcessField()throws Throwable
	{
		String[][] data = new String[][]
				{{"Field","OnDemandImageDescription","100"}};
				return data;
		
	}
	@DataProvider(name="AuditProcesswithTwoControlforField")
	public String[][]dataForCreateAuditProcessTwoControlField_2()throws Throwable
	{
		String[][]data=new String[][]
				{{"Field","OndemandImageDescription","50","50"}};
		return data;
}
	@DataProvider(name="AuditProcesswithThreeControlforField")
	public String[][]dataForCreateAuditProcessThreeControlField()throws Throwable
	{
		String[][]data=new String[][]
				{{"Field","OndemandImageandNumericDescription","35","35","30"}};
				return data;
	}
}
