package com.example;

import javax.jws.WebService;

@WebService
public class Loop {

	private SerialTest st;

	public SerialTest getSt() {
		return st;
	}

	public void setSt(SerialTest st) {
		this.st = st;
	}
	
	
}
