package com.jun.framework;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.journaldev.di.consumer.MyApplication;
import com.journaldev.di.injector.AppInjector;
import static spark.Spark.get;

public class App {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		MyApplication app = injector.getInstance(MyApplication.class);
		app.sendMessage("Hi Pankaj", "pankaj@abc.com");
		endPoint();
	}

	public static void endPoint() {
		get("/", "application/json", (request, response) -> {
			return "hello world";
		});
	}

}
