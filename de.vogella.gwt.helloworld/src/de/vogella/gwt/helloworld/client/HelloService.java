package de.vogella.gwt.helloworld.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("hello-service")
public interface HelloService extends RemoteService {
	public String socrates(int a, int b, int c);

}
