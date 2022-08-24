package com.example.response;

import org.springframework.stereotype.Component;

@Component
public class Response {
	
	String id;
	String message;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = "Created the document for " + message;
	}
	public Response(String id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public Response() {
		super();
	}
	
	

}
