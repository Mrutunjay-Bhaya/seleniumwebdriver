package utilities;

import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class JavaUtility {
	
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./commonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
	
	
	/**
	 * Its used to generate random number
	 */
	public int getRanDomNumber()
	{
		Random random = new Random();
		int intRandom = random.nextInt(10000);
		return intRandom;
	}
	
	
	/**
	 * used to get system date & time in IST format
	 */
	public String getSystemDateAndTime()
	{
		Date date = new Date();
		return date.toString();
	}
	
	
	/**
	 * used to get System date in YYYY-MM-DD format
	 */
	public String getSystemDateWithFormate()
	{
		Date date = new Date();
		String dateAndTime = date.toString();
		
		String YYYY = dateAndTime.split(" ")[5];
		String DD = dateAndTime.split(" ")[2];
		@SuppressWarnings("deprecation")
		int MM = date.getMonth()+1;
		
		String finalFormate=YYYY+"-"+MM+"-"+DD;
		return finalFormate;
	}
	public String sevenDaysBeforeToCurrentDate(){
		//Given Date in String format
		   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date(); 
		String CurrentDate=sdf.format(date);
		//System.out.println("Date before Addition: "+CurrentDate);
		//Specifying date format that matches the given date
		Calendar c = Calendar.getInstance();
		try{
		   //Setting the date to the given date
		   c.setTime(sdf.parse(CurrentDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		   
		//Number of Days to add
		c.add(Calendar.DAY_OF_MONTH,-7);  
		//Date after adding the days to the given date
		String PastSeventhDay = sdf.format(c.getTime());  
		//Displaying the new Date after addition of Days
		return PastSeventhDay;
	   }
	
	public String threeDaysBeforeToCurrentDate(){
		//Given Date in String format
		   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date(); 
		String presentDate=sdf.format(date);
		//System.out.println("Date before Addition: "+presentDate);
		//Specifying date format that matches the given date
		Calendar c = Calendar.getInstance();
		try{
		   //Setting the date to the given date
		   c.setTime(sdf.parse(presentDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		   
		//Number of Days to add
		c.add(Calendar.DAY_OF_MONTH,-7);  
		//Date after adding the days to the given date
		String PastthirdDay = sdf.format(c.getTime());  
		//Displaying the new Date after addition of Days
		return PastthirdDay;
	   }
	
	
	public String currentDate(){
		//Given Date in String format
		   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date(); 
		String Currentdate=sdf.format(date);
		//System.out.println("Date before Addition: "+Currentdate);
		//Specifying date format that matches the given date
		Calendar c = Calendar.getInstance();
		try{
		   //Setting the date to the given date
		   c.setTime(sdf.parse(Currentdate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		return Currentdate;
	}
	
	
	public String sevenDaysAfterToCurrentDate(){
		//Given Date in String format
		   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date(); 
		String PresentDate=sdf.format(date);
		//System.out.println("Date before Addition: "+PresentDate);
		//Specifying date format that matches the given date
		Calendar c = Calendar.getInstance();
		try{
		   //Setting the date to the given date
		   c.setTime(sdf.parse(PresentDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		   
		//Number of Days to add
		c.add(Calendar.DAY_OF_MONTH, 7);  
		//Date after adding the days to the given date
		String FutureDate = sdf.format(c.getTime());  
		//Displaying the new Date after addition of Days
		return FutureDate;
	   }

}
