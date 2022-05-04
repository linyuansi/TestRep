package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.zip.ZipInputStream;

public class Case {
	public static void main(String[] args) throws IOException {
		changeCode2();
	}

	public static void change() throws IOException {
		ZipInputStream zs = null;
		try {
			FileInputStream in = new FileInputStream("/Users/linys01/Desktop/111.zip");
			zs = new ZipInputStream(in);
			int i = zs.read();
			while (i != -1) {
				System.out.println(i);
				i = zs.read();
			}
		} catch (IOException e) {
			System.out.println("fail");
			e.printStackTrace();
		} finally {
		}
	}

	public static void changeCode() throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			FileInputStream in = new FileInputStream("/Users/linys01/Downloads/1111111.txt");
			InputStreamReader isr = new InputStreamReader(in, "GB18030");
			br = new BufferedReader(isr);
			File f = new File("/Users/linys01/Downloads/qiiiii" + ".txt");
			if (!f.exists()) {
				f.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(f);
			// OutputStreamWriter osw = new OutputStreamWriter(fos, "GB2312");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			bw = new BufferedWriter(osw);
			String s;
			while ((s = br.readLine()) != null) {
				bw.write(s + "\n");
				// bw.newLine();
			}
			bw.flush();
			System.out.println("success");
		} catch (IOException e) {
			System.out.println("fail");
			e.printStackTrace();
		} finally {
			if (bw != null)
				bw.close();
			if (br != null)
				br.close();
		}
	}

	public static void changeCode2() throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		File f = new File("/Users/linys01/Downloads/12345");
		File[] listFiles = f.listFiles();
		Arrays.sort(listFiles, new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				if (o1.length() > o2.length()) {
					return 1;
				}
				return -1;
			}
		});
	//	try {
//			File f1 = new File("/Users/linys01/Downloads/uuuuu" + ".txt");
//			if (!f1.exists()) {
//				f1.createNewFile();
//			}
			//FileOutputStream fos = new FileOutputStream(f1,true);
			// OutputStreamWriter osw = new OutputStreamWriter(fos, "GB2312");
			//OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			//bw = new BufferedWriter(osw);
			for (int i = 0; i < listFiles.length; i++) {
				String a = "";
				if (i < 9) {
					a = "000" + (i + 1);
				} else if (i < 99) {
					a = "00" + (i + 1);
				} else if (i < 999) {
					a = "0" + (i + 1);
				}else {
					a = "" + (i + 1);
				}
				 listFiles[i].renameTo(new
				 File("/Users/linys01/Downloads/12345/"+a+listFiles[i].getName().substring(listFiles[i].getName().lastIndexOf("."))));

//				FileInputStream in = new FileInputStream(listFiles[i]);
//				InputStreamReader isr = new InputStreamReader(in, "GB18030");
//				br = new BufferedReader(isr);
//				
//				
//				
//				String s;
//				s = "第" + a + "章" + "   名字:" + listFiles[i].getName();
//				bw.write(s + "\n");
//				while ((s = br.readLine()) != null) {
//					bw.write(s + "\n");
//					// bw.newLine();
//				}
//				bw.flush();
//				// listFiles[i].renameTo(new
//				// File("/Users/linys01/Downloads/12345/"+a+listFiles[i].getName()));
//			}
//			System.out.println("success");
//		} catch (IOException e) {
//			System.out.println("fail");
//			e.printStackTrace();
//		} finally {
//			if (bw != null)
//				bw.close();
//			if (br != null)
//				br.close();
	}
	}
}
