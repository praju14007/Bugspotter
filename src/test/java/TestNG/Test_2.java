package TestNG;

import org.testng.annotations.Test;

public class Test_2 {

	@Test(groups= {"Sanity"})
	public void test1() {
	System.out.println("Execute test1:");
	}

	@Test(groups= {"Regression"})
	public void test2() {
     System.out.println("Execute test2:");
	}

	@Test(groups= {"Sanity"})
	public void test3() {
	System.out.println("Execute test3:");
	}

	@Test(groups= {"Sanity"})
	public void test4() {
	System.out.println("Execute test4:");
	}

	@Test(groups= {"Regression"})
	public void test5() {
	System.out.println("Execute test5:");

}}
