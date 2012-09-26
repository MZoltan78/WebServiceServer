package com.example;

import javax.jws.WebService;

@WebService
public class TesztWS {
	
	private static int counter = 0;
	

	/*
	 * 		Ez a server része, ehhez kell majd wsimport-tal egy kliens osztályt generáltatni, ami a responset dolgozza fel
	 */
    public String sayHello(String name) {
        return "Hello " + name + " !  ("+ (++counter) +")";
    }		
	
}
