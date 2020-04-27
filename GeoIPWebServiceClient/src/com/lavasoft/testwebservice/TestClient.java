package com.lavasoft.testwebservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.Service;

import org.apache.axis.AxisFault;

import com.lavasoft.GeoIPServiceSoapStub;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {

		URL url = new URL("http://wsgeoip.lavasoft.com/ipservice.asmx");

		Service service = new org.apache.axis.client.Service();
		GeoIPServiceSoapStub stub = new GeoIPServiceSoapStub(url, service);
		System.out.println("ISO Name -- " + stub.getCountryISO2ByName("India"));

	}
}
