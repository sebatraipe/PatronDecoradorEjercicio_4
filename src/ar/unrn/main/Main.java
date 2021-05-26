package ar.unrn.main;

import ar.unrn.decorator.modelo.RestCall;

public class Main {

	public static void main(String[] args) {
		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");
		System.out.println(rest.run());

	}

}
