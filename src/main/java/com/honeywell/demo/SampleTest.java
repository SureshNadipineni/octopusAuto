package com.honeywell.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
public class SampleTest {

@RequestMapping("/helloWorld")
public String Get_HelloWord() {

return "Hello World";
}

@RequestMapping("/")
public String homePage() {

return "<html><body><h1>Hello World Home</h1></body></html>";
}

@RequestMapping("/test/{variable1}")
public String printVariable(@PathVariable String variable1) {

return variable1;
}


}
