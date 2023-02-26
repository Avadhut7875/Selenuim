package first;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test(dataProvider = "dataSet")
	void read(String name, String last) {
		System.out.println(name+" "+last);
	}
	
	@DataProvider
	public Object[][] dataSet(){
		return new Object[][] {
			{"avadhut","mane"},
			{"akash","vasudev"}
			
		};
	}
	
	

}
