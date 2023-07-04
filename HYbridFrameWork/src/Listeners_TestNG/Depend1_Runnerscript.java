package Listeners_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend1_Runnerscript {
		@Test
		public void test1()
		{
			System.out.println("hello India");
		}
		@Test
		public void test2()
		{
			System.out.println("hello Asia");
			Assert.fail();
		}
		@Test(dependsOnMethods="test2")
		public void test3()
		{
			System.out.println("hello bangalore");
		}
		}


