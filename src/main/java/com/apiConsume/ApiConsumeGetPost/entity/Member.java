package com.apiConsume.ApiConsumeGetPost.entity;

public class Member {
	
	//private String name;
	private String body;
	private String message;
	
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Member [body=" + body + ", message=" + message + "]";
	}

	
	
	
	

	
	

}
