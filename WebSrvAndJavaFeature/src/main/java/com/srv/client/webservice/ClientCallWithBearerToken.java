package com.srv.client.webservice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.entity.StringEntity;

public class ClientCallWithBearerToken {
	public static void main(String[] args) {

		HttpResponse response;
		CloseableHttpClient cc = HttpClients.createDefault();
		String authString = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IlNTUWRoSTFjS3ZoUUVEU0p4RTJnR1lzNDBRMCIsImtpZCI6IlNTUWRoSTFjS3ZoUUVEU0p4RTJnR1lzNDBRMCJ9.eyJhdWQiOiIyYzFhNjYzNi0yN2JlLTQ0MjMtOTBhYi1jZTAzNzc3MjMwNGYiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8wNTNjYzNmMC0zODQ5LTRkYjQtODZjYi1kMzEwYmRhNjM0YmUvIiwiaWF0IjoxNTIxNTQ5Njk0LCJuYmYiOjE1MjE1NDk2OTQsImV4cCI6MTUyMTU1MzU5NCwiYWNyIjoiMSIsImFpbyI6IlkyTmdZR2k4OWxyZStrMjd2OEZmcHdNWFZESkNKOWQ1VDlnZHExRVg1c0t5dk9ueGsxUUEiLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiOTM4ZjM5NDYtMjgxNC00ZjE5LTg0YzUtNmU5ODg0NGUxNTcwIiwiYXBwaWRhY3IiOiIwIiwiZV9leHAiOjI2MjgwMCwiZmFtaWx5X25hbWUiOiJQb25udXNhbXkiLCJnaXZlbl9uYW1lIjoiQmFsYXN1YnJhbWFuaWFuIiwiZ3JvdXBzIjpbImZiNDY2MDc0LTk2YzctNDZlYi1iNDc1LTA0OTRmODY1MjJmMSIsImFmYTUyNzYwLTFmNDEtNGMzZS1iYTA0LWNkZjcyZDI5ZjUyOCIsIjdjZWIwZDliLWQwZDMtNDI1Mi04N2I1LTk1MTA4MGUyZGE1ZSIsImIwMzQ1ZGFlLWE4ZjMtNDRkNi1hMDQ1LTdiYzA5MThlNjA5YiIsIjM2NjlhMmEwLTNkNjYtNDdhNC1iYWI2LTYzZjk2MDYwMjJiMCIsIjkyN2JhNmU2LThhNjQtNDNkMy04YjJlLTU4N2MzYmU1ZmRhMyJdLCJpcGFkZHIiOiIyNy41LjIwNi43MCIsIm5hbWUiOiJQb25udXNhbXkgQmFsYXN1YnJhbWFuaWFuIiwib2lkIjoiNzQxMDc2ZGItMTllYi00NjlkLTg5NTktNmI5MDU1NzMyYjZiIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoibUNLcjVIcHN4SzFxVXBGVlg4Z0Rtem9oSXUxTThQNFBYRkV0dU10MXJTayIsInRpZCI6IjA1M2NjM2YwLTM4NDktNGRiNC04NmNiLWQzMTBiZGE2MzRiZSIsInVuaXF1ZV9uYW1lIjoiQmFsYXN1YnJhbWFuaWFuLlBvbm51c2FteUB0bnNtb2JpbGUuY29tIiwidXBuIjoiQmFsYXN1YnJhbWFuaWFuLlBvbm51c2FteUB0bnNtb2JpbGUuY29tIiwidXRpIjoiSmlWMjM1SmtMRTZySElpX3JoMElBQSIsInZlciI6IjEuMCJ9.CdEoE_1xGiQNtQqC_80jpG8bz7KpkRi1wxIsmk_XIUVw5WRGlhUbzVNHfcQclqFX17h-9coAG-WFSZOe2pn75XvRyrQ5k4Ywm27KLw70cy2nCvsc4SPY6nx4Vhohcq7yIstyFzFqPNXl27Ay_EJelsEl4_qLwF7W08C-xOjFuvdlAA0ANlxSf5MNMjxXxrzJCrdKvkvjlsZgF3d9AJyf2ClphL4JrRtQcfsrR6WXblFam1-hg60yDf0Y_jhUCYbDy0LtOoJE_8i0yiMSyyvNCtRcUHmVRR3V8gYaSWdl1bj9c8_-Ue3y6nxs8v-heDd_L55VHRmunP4qbG-lOZdpfw";
		String output;
		try {

			HttpPost hPost = new HttpPost(
					URI.create("https://gemsapi-dev.azurewebsites.net//v01/care/IMEIValidation/"));
			StringEntity input = new StringEntity("{\"SerialNumber\":356040080304278}");
			input.setContentType("application/json");
			hPost.setEntity(input);
			hPost.addHeader(HttpHeaders.AUTHORIZATION, authString);
			response = cc.execute(hPost);
			System.out.println("Response is " + response.toString());
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
		} catch (Exception e) {
		}
	}
}
