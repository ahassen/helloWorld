package pages

import geb.Module
import geb.Page

class HelloPage extends Page {
	static url = "hello/world"
	
	static at = {
		title ==~ /Hello/
	}
	
	static content = {
		firstDiv(required:true){ $("div") }
	}
}
