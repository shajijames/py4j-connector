package com.ctrl4bi.py4j;

import py4j.GatewayServer;

public class App 
{
	    public static void main(String[] args) {
	        GatewayServer server = new GatewayServer(null);
	        
	        // This will start the Py4J server and now, the JVM is ready to receive Python commands.
	        // Once gateway.shutdown is called on the Python side, this call will return, and the Java program
	        // will exit.
	        // Obviously, this can be way more complex, but it's a good start :-)
	        server.start();
	    }
}
