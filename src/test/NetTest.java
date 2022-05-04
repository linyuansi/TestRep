package test;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetTest {
	public static void main(String[] args) {
		HttpURLConnection conn = null;
		BufferedReader reader = null;
		String rs = null;
		try {
			StringBuffer sb = new StringBuffer();
			URL url = new URL("http://localhost:8080/hello/");
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-agent", "");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
