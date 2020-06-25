package com.testNg;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zoopla.Zooplaclass;

public class TestNG extends Zooplaclass {
	
	TestNG test;

	@BeforeTest
	public void runsetup() throws InterruptedException {

		test = new TestNG();
		test.openbrowser();
		test.maximizeBrowser();
		test.getUrl();
		Thread.sleep(1000);
		test.closecookies();
	}

	@Test
	public void getTrip() throws InterruptedException {
		Thread.sleep(1000);
		test.getsingin();

		Thread.sleep(1000);
		test.getsearch();
		test.getprice();

		Thread.sleep(1000);
		test.getclosepopup();
		test.selectfifthproperty();
		Thread.sleep(1000);
		test.verifylogo();
		test.verifyagentname();
		test.verifyphonenumber();

		Thread.sleep(1000);
		test.getsignout();

	}


}
