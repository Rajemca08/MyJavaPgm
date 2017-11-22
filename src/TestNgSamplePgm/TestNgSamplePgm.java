package TestNgSamplePgm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSamplePgm {
	@BeforeSuite
	public void beforeSuitemethod(){
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethodex(){
		System.out.println("Before Method");
	}
	
	
	
	@Test	
	public void testprj(){
		System.out.println("test");
	}
	
	@Test	
	public void testprj2(){
		System.out.println("testprj2");
	}
	
	@AfterTest
	public void afterTestMethod(){
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void afterMethodex(){
		System.out.println("AfterMethod");
	}
	

}
