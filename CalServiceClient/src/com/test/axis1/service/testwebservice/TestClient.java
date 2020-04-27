package com.test.axis1.service.testwebservice;

import org.apache.axis.client.Service;

import com.test.axis1.service.CalServiceSoapBindingStub;

public class TestClient {

	public static void main(String[] args) throws Exception {

		java.net.URL endPointUrl = new java.net.URL("http://localhost:8080/"
				+ "CalculatorService/services/CalService");

		org.apache.axis.client.Service service = new Service();

		CalServiceSoapBindingStub stub = new CalServiceSoapBindingStub(endPointUrl, service);
		
		int result=stub.add(10, 10);
		System.out.println("Addition--"+result);
	}

}
