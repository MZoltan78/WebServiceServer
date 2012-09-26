package com.example;

import java.net.InetAddress;

import javax.xml.ws.Endpoint;

public class MainServer {

	public static void main(String[] args) {
		try {
			String address = InetAddress.getLocalHost().getHostAddress();
			String url = "http://" + address + ":8080/hello";
			System.out.println("### startin WS at: \t" + url);
			//Endpoint endpoint = 
			Endpoint.publish(url, new SerialTest());
			
		} catch (Exception e) {
		}
	}

}
