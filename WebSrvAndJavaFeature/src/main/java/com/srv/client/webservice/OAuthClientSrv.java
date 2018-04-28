package com.srv.client.webservice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;

public class OAuthClientSrv {
	
	public static final String requestURL = "https://gemsapi-dev.azurewebsites.net/v01/care/IMEIValidation/";
	//public static final String requestURL = "https://gemsapi-dev.azurewebsites.net";
	public static final String clientID = "a8a49fa3-07e3-4a57-9327-34b4d3165a82";
	public static final String clientSecret = "l5pEZzPDTr0a2HO1o6/h2J1qb4ZvZCQXD8iWxyCLcJM=";
	public static final String appID = "2c1a6636-27be-4423-90ab-ce037772304f";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("OAuth 1");
			OAuthClient client = new OAuthClient(new URLConnectionClient());
			System.out.println("OAuth 2" + requestURL );
			OAuthClientRequest request = OAuthClientRequest.tokenLocation(requestURL).setGrantType(GrantType.AUTHORIZATION_CODE).setClientId(clientID).setClientSecret(clientSecret).setUsername("balasubramanian.ponnusamy@tnsmobile.com").setPassword("Chennai@2017").setRedirectURI("https://gemsapi-dev.azurewebsites.net/v01/care/IMEIValidation/").buildBodyMessage();
			System.out.println("OAuth 3" + request.getBody());			
			//String token = client.accessToken(request, OAuthJSONAccessTokenResponse.class).getAccessToken();
			OAuthAccessTokenResponse oAuthResponse = client.accessToken(request, OAuthJSONAccessTokenResponse.class);
			System.out.println("OAuth 4");
			HttpURLConnection resource = (HttpURLConnection)(new URL(requestURL).openConnection());
			System.out.println("OAuth 5");
			//resource.addRequestProperty("Authorization", "Bearer "+ token);
			System.out.println("OAuth 6");
			InputStream inResource = resource.getInputStream();
            System.out.println("inResource : " + inResource.toString());
            BufferedReader r = new BufferedReader(new InputStreamReader(inResource, "UTF-8"));
            String line = null;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
		}
		catch(Exception e)
		{
			
		}
	}

}
