package de.vogella.gwt.helloworld.client;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface HelloServiceAsync {

	void socrates(int a, int b, int c, AsyncCallback<String> callback);

}
