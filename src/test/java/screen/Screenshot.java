package screen;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.baseclass.BaseClass;

import utilities.WebDriverUtility;


public class Screenshot implements ITestListener {

	public void onTestFailure(ITestResult result) {
		WebDriverUtility wd=new WebDriverUtility();
		try {
			wd.takeScreenShot(BaseClass.driver, result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
