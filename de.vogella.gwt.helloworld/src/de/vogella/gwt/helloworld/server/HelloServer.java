package de.vogella.gwt.helloworld.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.vogella.gwt.helloworld.client.HelloService;

public class HelloServer extends RemoteServiceServlet implements HelloService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String socrates(int a, int b, int c)  throws IllegalArgumentException {
	
	double  delta=b * b - 4 * a * c;
	    String root1,root2;
	    String result;
		double square = Math.sqrt(delta);
	if(square>0)
		{ 	root1 =(-b +  square) / (2*a)+" " ;
			root2 =(-b -  square) / (2*a)+" " ;
		   	result=root1+"   "+root2;
	      	 return result;
	      	}
	
		else if(square==0)
		{root1 = (-b) / (2*a)+" " ;
		 result=root1;
		 return result;
		 	}
	
		else 
		{result="no Roots";
		return result;
		}
    
	}

}
