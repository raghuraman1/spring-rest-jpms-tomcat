package my.module.pub;

import my.module.priv.PrivateApi;

public class LibraryApi {
	private PrivateApi internal= new PrivateApi();

	public String doSomething(String input) {
		return internal.doSomething(input);
	}

}
