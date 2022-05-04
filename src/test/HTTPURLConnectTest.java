package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPURLConnectTest {
	String path = "http://www.baidu.com/s?ie=UTF-8&wd=%E7%88%B1%E5%A5%87%E8%89%BA";
	public void getContent(){
		HttpURLConnection conn = null;
		BufferedInputStream br = null;
		PrintWriter pw = null;
		try {
			URL url = new URL(path);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			InputStream is = conn.getInputStream();
			br = new BufferedInputStream(is);
			FileOutputStream fos = new FileOutputStream("src/test/NewFile.html");
			pw = new PrintWriter(fos);
			String line = null;
			byte[] b = new byte[1024];
			while(br.read(b)> 0){
				pw.println(new String(b));
				pw.flush();
			}
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			if(pw != null){
				pw.close();
			}
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null){
				conn.disconnect();
			}
		}
		
	}
	public static void main(String[] args) {
		HTTPURLConnectTest connectTest = new HTTPURLConnectTest();
		connectTest.getContent();
	}
}
