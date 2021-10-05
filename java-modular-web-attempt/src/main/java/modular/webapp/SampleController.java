package modular.webapp;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import my.consumingmodule.pub.Api;



@RestController
public class SampleController {
	@Autowired
	private Api api;
	@GetMapping("/greeting")
	public ResponseEntity<String> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		String hello=api.doSomething("Hello");
		System.out.println("listing modules");
		 ModuleLayer.boot().modules().stream()
         .map(Module::getName)
         .forEach(System.out::println);
		 System.out.println("listed modules");
		 
		return new ResponseEntity<String>(hello, HttpStatus.OK);
	}
}
