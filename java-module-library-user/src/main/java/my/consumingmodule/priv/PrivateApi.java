package my.consumingmodule.priv;

import my.module.pub.LibraryApi;

public class PrivateApi {
	private LibraryApi library= new LibraryApi();

	public String doSomething(String input) {
		return library.doSomething(input);
	}

}
