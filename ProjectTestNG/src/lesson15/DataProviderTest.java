package lesson15;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "dataSet")
	public void providerTest(String name, String pass) {
		System.out.println(name + " == " + pass);
	}
	
	@Test(dataProvider = "dataSet1")
	public void providerTest1(String name, String pass, String test ) {
		System.out.println(name + " == " + pass + " == " + test);
	}
	
	
	@DataProvider
	public Object[][] dataSet1(){
		return new Object[][]{
		{"name_1", "pass_1", "test1"},
		{"name_2", "pass_2", "test2"},
		{"name_3", "pass_3", "test3"},
		{"name_4", "pass_4", "test4"}
		};
	}

	@DataProvider
	public String[][] dataSet() {
		String[][] dataset = new String[4][2];
		
		dataset[0][0] = "name1";
		dataset[0][1] = "pass1";
		
		dataset[1][0] = "name2";
		dataset[1][1] = "pass2";
		
		dataset[2][0] = "name3";
		dataset[2][1] = "pass3";
		
		dataset[3][0] = "name4";
		dataset[3][1] = "pass4";
		
		return dataset;
		
	}
	
}


	
