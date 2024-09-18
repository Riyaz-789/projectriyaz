package com.Test;

import org.testng.annotations.Test;


import com.Pom.Loginpage;
import com.base.BaseClass;

public class TestLogin extends BaseClass{
	@Test
	public void login_test() {
		Loginpage obj=new Loginpage(driver);
		
		obj.inputemail("7396340919");
		obj.inputpassword("riyaz123");
		obj.clickloginbtn();
	}

}
