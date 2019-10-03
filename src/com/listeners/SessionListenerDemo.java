package com.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionListenerDemo
 *
 */
@WebListener
public class SessionListenerDemo implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public SessionListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event)  { 
    	event.getSession().getId();
    	System.out.println("session created");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event)  { 
        
    event.getSession().getLastAccessedTime();
    	System.out.println("session destroyed");
    }
	
}
