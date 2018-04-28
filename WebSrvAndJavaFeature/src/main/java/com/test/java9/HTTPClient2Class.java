package com.test.java9;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;



public class HTTPClient2Class {

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		try
		{
			// TODO Auto-generated method stub
			HttpClient hc = HttpClient.newHttpClient();
			System.out.println("Http Client Version is :" + hc.version());
			HttpRequest hr = HttpRequest.newBuilder().uri(new URI("http://rams4java.blogspot.co.uk/2016/05/java-news.html")).GET().build();
			Map<String,List<String>> header =  hr.headers().map();
			System.out.println("Http Header size is " +header.size());
			HttpResponse.BodyHandler body = HttpResponse.BodyHandler.asString();
			HttpResponse response = hc.send(hr, body);
			System.out.println("Status code is :" + response.statusCode());
			String bodyTest = response.body().toString();
			System.out.println("Body Test is :"+ bodyTest);
			header.forEach((k,v) -> System.out.println(k + "       " + v));
			System.out.println("Status code is :" + response.statusCode());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
