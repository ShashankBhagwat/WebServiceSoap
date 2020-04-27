package com.test.apachecxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.apachecxf.test.com/", portName = "HelloWorldPort", serviceName = "HelloWorldService")
public class HelloWorld {

	@WebMethod(operationName = "getGreeting", action = "urn:GetGreeting")
	public String getGreeting(@WebParam(name = "arg0") String name) {
		return "Hello " + name;
	}
}
