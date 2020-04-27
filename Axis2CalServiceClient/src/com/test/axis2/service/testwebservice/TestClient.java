package com.test.axis2.service.testwebservice;

import com.test.axis2.service.CalServiceStub;

public class TestClient {

	public static void main(String[] args) throws Exception {

		CalServiceStub stub = new CalServiceStub();
		
		CalServiceStub.Add params=new CalServiceStub.Add();
		
		params.setA(20);
		params.setB(30);
		
		CalServiceStub.AddResponse res=stub.add(params);
		
		System.out.println("Addition ****"+res.get_return());
	}

}
