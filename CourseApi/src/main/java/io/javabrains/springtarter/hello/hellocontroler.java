package io.javabrains.springtarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroler {

@RequestMapping("/hello")
public String sayHi() {
	return("hi it worked finaly");
	

}

}
