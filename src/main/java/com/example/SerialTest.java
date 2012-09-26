package com.example;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlTransient;

@WebService
public class SerialTest {

	
	private Loop lp;
	
	public Loop getLp() {
		return lp;
	}



	public void setLp(Loop lp) {
		this.lp = lp;
	}



	public String name() {
		return "name";
	}

	
	
	/*
	 * xmltransient
	 * 		wsdl-ben nem fog latszodni
	 */
	
	@XmlTransient
	public String hiddenName() {
		return "hiddenName";
	}

}
