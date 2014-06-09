package de.vogella.gwt.helloworld.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextArea;

public class HelloGwt implements EntryPoint {
	 HelloServiceAsync helloservice=GWT.create(HelloService.class);
	 

	 
	  public void onModuleLoad() {
		 	
		final TextArea text_a=new TextArea();
		final TextArea text_b=new TextArea();
		final TextArea text_c=new TextArea();
		
	    final Button button = new Button("");
	    
	    button.addClickHandler(new ClickHandler() {
	      
	      public void onClick(ClickEvent event) {
	    	  button.setEnabled(true);
			button.setFocus(true);
	    	  
	    	 
	      }
	    });

	    class Socrates implements ClickHandler, KeyUpHandler
	    { public void onClick(ClickEvent event) {
			sendParamsToServer();
		}

		
		public void onKeyUp(KeyUpEvent event) {
			if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
				sendParamsToServer();
			}
		}

		
		private void sendParamsToServer() {
							
			int aa=Integer.valueOf(text_a.getText());
	    	 int bb=Integer.valueOf(text_b.getText());
		     int cc=Integer.valueOf(text_c.getText());
		     helloservice.socrates(aa,bb,cc,new AsyncCallback<String>() {
						public void onFailure(Throwable caught) {
							
							Window.alert("Error");
						}

						public void onSuccess(String result) {
							Window.alert(result);
						}
					});
		}
	   
	  }
	 

		Socrates handler = new Socrates();
		button.addClickHandler(handler);
				
			}
		}
			
	 
