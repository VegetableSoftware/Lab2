package org.apache.struts.helloworld.action;


public class HelloWorldAction {
	
	private String name;
	
	public String execute() throws Exception {
		System.err.println("execute called");
		if ("SELECT".equals(name)){
			return "success";
		} else {
			return "error";
		}
	}
	
	public String getName() {
		System.err.println("getName called");
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.err.println("setName called");
	}
}
