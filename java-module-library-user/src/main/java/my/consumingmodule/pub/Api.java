package my.consumingmodule.pub;

import org.springframework.stereotype.Component;

import my.consumingmodule.priv.PrivateApi;
@Component
public class Api {
	PrivateApi privateApi= new PrivateApi();

	public String doSomething(String input) {
		return privateApi.doSomething(input);
	}

}
