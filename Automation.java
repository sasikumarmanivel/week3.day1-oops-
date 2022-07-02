package org.system;

public class Automation extends MultipleLanguage implements Language, TestTool {



public void Selenium() {
	System.out.println("Selenium from Testtool");
	
}

public void Java() {
	System.out.println("Java from Language");
	
}

public static void main(String[] args) {
	Automation au = new Automation();
	au.python();
	au.ruby();
	au.Selenium();
	au.Java();
}
}
