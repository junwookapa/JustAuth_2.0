package com.jun.framework;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.journaldev.di.consumer.MyApplication;
import com.journaldev.di.injector.AppInjector;

public class App {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		
		MyApplication app = injector.getInstance(MyApplication.class);
		app.sendMessage("Hi Pankaj", "pankaj@abc.com");
	}

}
