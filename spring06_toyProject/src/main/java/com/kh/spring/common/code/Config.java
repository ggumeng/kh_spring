package com.kh.spring.common.code;

public enum Config {
	
	//DOMAIN("https://pclass.ga"),
	DOMAIN("http://localhost:9090"),
	COMPANY_EMAIL("kwon41147406@gmail.com"),
	SMTP_AUTHENTICATION_ID("kwon41147406@gmail.com"),
	SMTP_AUTHENTICATION_PASSWORD("gozldgkwlak123!"),
	//UPLOAD_PATH("C:\\CODE\\before\\"),
	UPLOAD_PATH("C:\\CODE\\before\\upload\\");

	public final String DESC;
	
	Config(String desc) {
		this.DESC = desc;
	}

	
	
}
