package dataSupplier;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utilities.XLUtilities;






public class DataSupply {
	
	@DataProvider(name="DataForCreateControl")
	public String[][] dataForOnDemandControl() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Samruddhi"},
				{"Ondemand Branch Image Evidence and Numeric Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "2", "Samruddhi"},
				{"Ondemand Branch Text Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "5", "Samruddhi"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Gati"},
				{"Ondemand Branch Image Evidence and Numeric Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "2", "Gati"},
				{"Ondemand Branch Text Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "5", "Gati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Pragati"},
				{"Ondemand Branch Image Evidence and Numeric Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "2", "Pragati"},
				{"Ondemand Branch Text Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "5", "Pragati"}};
				
		return data;
}
	@DataProvider(name="createControlWithTwoBranchTypes")
	public String[][] createControlWithTwoBranchTypes() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Samruddhi", "Gati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "2", "Samruddhi", "Gati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "5", "Samruddhi", "Gati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Pragati", "Gati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "2", "Pragati", "Gati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "5", "Pragati", "Gati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Samruddhi", "Pragati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "2", "Samruddhi", "Pragati"},
				{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "5", "Samruddhi", "Pragati"}};
			   return data;
	}
	@DataProvider(name="createControlWithThreeBranchTypes")
	public String[][] createControlWithThreeBranchTypes() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Samruddhi", "Gati","Pragati"},
				{"Ondemand Branch Image and Numeric Evidence Control", "Ondemand Branch Image and Numeric Description", "Branch", "Branch OnDemand Evidence", "2", "Samruddhi", "Gati","Pragati"},
			    {"Ondemand Branch Image and Numeric Evidence Control", "Ondemand Branch Image and Numeric Description", "Branch", "Branch OnDemand Evidence", "2", "Samruddhi", "Gati","Pragati"}};
			   return data;
	}
	
	@DataProvider(name="DataForCreateControlRegular")
	public String[][] getDataForRegularControl() throws IOException
	{
		String[][] regulardata = new String[][] 
			   {{"Regular Branch Image Evidence Control", "Regular Branch Image Description", "Branch", "Branch OnDemand Evidence", "1","Weekly", "Samruddhi"},
				{"Regular Branch Image Evidence and Numeric Control", "Regular Branch Image and Numeric Description", "Branch", "Branch OnDemand Evidence", "2","Weekly", "Samruddhi"},
				{"Regular Branch Text Evidence Control", "Regular Branch Text Description", "Branch", "Branch OnDemand Evidence", "5", "Weekly","Samruddhi"},
				{"Regular Branch Image Evidence Control", "Regular Branch Image Description", "Branch", "Branch OnDemand Evidence", "1","Daily", "Gati"},
				{"Regular Branch Image Evidence and Numeric Control", "Regular Branch Image and Numeric Description", "Branch", "Branch OnDemand Evidence", "2","Weekly", "Gati"},
				{"Regular Branch Text Evidence Control", "Regular Branch Text Description", "Branch", "Branch OnDemand Evidence", "5", "Monthly","Gati"},
				{"Regular Branch Image Evidence Control", "Regular Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Daily","Pragati"},
				{"Regular Branch Image Evidence and Numeric Control", "Regular Branch Image and Numeric Description", "Branch", "Branch OnDemand Evidence", "2","Weekly", "Pragati"},
				{"Regular Branch Text Evidence Control", "Regular Branch Text Description", "Branch", "Branch OnDemand Evidence", "5","Monthly", "Pragati"}};
				
		return regulardata;
}	
	@DataProvider(name="ClickOnCreateControl")
	public String[][] directCreateClick() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Samruddhi"}};
			   return data;
	}
	
	@DataProvider(name="ClickOnCreateWithoutControlName")
	public String[][] createWithoutName() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "2", "Samruddhi"}};
			   return data;
	}
	@DataProvider(name="ClickOnCreateWithoutDescription")
	public String[][] createWithoutDescription() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "5", "Samruddhi"}};
			   return data;
	}
	@DataProvider(name="ClickOnCreateWithoutEvidenceCaptured")
	public String[][] createWithoutEvidenceCaptured() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Samruddhi"}};
			   return data;
	}
	
	@DataProvider(name="ClickOnCreateWithoutAcceptableEvidence")
	public String[][] createWithoutAcceptableEvidence() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "2", "Samruddhi"}};
			   return data;
	}
	@DataProvider(name="ClickOnCreateWithoutType")
	public String[][] createWithoutType() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "5", "Samruddhi"}};
			   return data;
	}
	@DataProvider(name="ClickOnCreateWithoutBranchType")
	public String[][] createWithoutBranchType() throws IOException
	{
		String[][] data = new String[][] 
			   {{"Ondemand Branch Image Evidence Control", "Ondemand Branch Image Description", "Branch", "Branch OnDemand Evidence", "1", "Samruddhi"}};
			   return data;
	}
	
	@DataProvider(name="AuditProcesswithOneControlforSamruddhi")
	 public String[][] dataForCreateAuditProcessSamruddhi() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet1");
		int colcount=XLUtilities.getCellCount(path, "Sheet1",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet1", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	@DataProvider(name="AuditProcesswithOneControlforGati")
	 public String[][] dataForCreateAuditProcessGati() throws IOException{
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet2");
		int colcount=XLUtilities.getCellCount(path, "Sheet2",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet2", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	@DataProvider(name="AuditProcesswithOneControlforPragati")
	 public String[][] dataForCreateAuditProcessPragati() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet3");
		int colcount=XLUtilities.getCellCount(path, "Sheet3",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet3", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	
	@DataProvider(name="AuditProcesswithTwoControlforSamruddhi")
	 public String[][] dataForCreateAuditProcessSamruddhiWithTwoControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet4");
		int colcount=XLUtilities.getCellCount(path, "Sheet4",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet4", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	
	@DataProvider(name="AuditProcesswithTwoControlsforGati")
	 public String[][] dataForCreateAuditProcessGatiWithTwoControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet5");
		int colcount=XLUtilities.getCellCount(path, "Sheet5",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet5", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	@DataProvider(name="AuditProcesswithTwoControlsforPragati")
	 public String[][] dataForCreateAuditProcessPragatiWithTwoControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet6");
		int colcount=XLUtilities.getCellCount(path, "Sheet6",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet6", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	@DataProvider(name="AuditProcesswithThreeControlsforSamruddhi")
	 public String[][] dataForCreateAuditProcessSamruddhiWithThreeControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet7");
		int colcount=XLUtilities.getCellCount(path, "Sheet7",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet7", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	@DataProvider(name="AuditProcesswithThreeControlsforGati")
	 public String[][] dataForCreateAuditProcessGatiWithThreeControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet8");
		int colcount=XLUtilities.getCellCount(path, "Sheet8",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet8", i,j);
			}
		}		
		return createScheduledata;
	}	
	@DataProvider(name="AuditProcesswithThreeControlsforPragati")
	 public String[][] dataForCreateAuditProcessPragatiWithThreeControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet9");
		int colcount=XLUtilities.getCellCount(path, "Sheet9",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet9", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	
	@DataProvider(name="AuditProcesswithFourControlsforSamruddhi")
	 public String[][] dataForCreateAuditProcessSamruddhiWithFourControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet10");
		int colcount=XLUtilities.getCellCount(path, "Sheet10",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet10", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	
	@DataProvider(name="AuditProcesswithFourControlsforGati")
	 public String[][] dataForCreateAuditProcessGatiWithFourControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet11");
		int colcount=XLUtilities.getCellCount(path, "Sheet11",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet11", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	
	@DataProvider(name="AuditProcesswithFourControlsforPragati")
	 public String[][] dataForCreateAuditProcessPragatiWithFourControls() throws IOException{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet12");
		int colcount=XLUtilities.getCellCount(path, "Sheet12",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet12", i,j);
			}
		}
		
		return createScheduledata;
	}
	
	@DataProvider(name="NegativeTestingOfCreateAuditProcess")
	 public String[][] negativeTestingCreateAuditProcessSamruddhi() throws IOException
	{
		
		String path= "C:\\Users\\132997\\eclipse-workspace\\AuditManagementSystem\\Configuration\\CreateAuditProcess.xlsx";
		int rownum=XLUtilities.getRowCount(path, "Sheet13");
		int colcount=XLUtilities.getCellCount(path, "Sheet13",1);
		String createScheduledata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				createScheduledata[i-1][j]=XLUtilities.getCellData(path, "Sheet13", i,j);
			}
		}
		return createScheduledata;
	}
}
