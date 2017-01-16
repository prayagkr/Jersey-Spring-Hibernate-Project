package org.pramod.config;

import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig{

	public MyApplication(){
		register(MyResource.class);
		register(CustomerResource.class);
	}
}
