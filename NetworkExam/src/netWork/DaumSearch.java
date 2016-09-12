package netWork;

import java.net.*;
import java.io.*;
import java.util.*;

public class DaumSearch {

	public static void main(String[] args) {
		try {
			System.out.println("검색할 단어: ");
			Scanner sc = new Scanner(System.in);
			String keyword = sc.next();
			String keyboard = URLEncoder.encode(keyword);
//			String keyboard = URLEncoder.encode("수박");
			String query = "w=tot&DA=UME&t__nil_searchbox=suggest&sug=&sugo=15&sq=%EC%88%98%EB%B0%95&o=1&q="+keyboard;
			String u = "http://search.daum.net/search?";
			System.out.println(u+query);
			URL url = new URL(u+query);
			URLConnection connection = url.openConnection();
			HttpURLConnection hurlc = (HttpURLConnection) connection;
			hurlc.setRequestMethod("GET");
			hurlc.setDoOutput(true);
			hurlc.setDoInput(true);
			hurlc.setUseCaches(false);
			hurlc.setDefaultUseCaches(false);
			PrintWriter out = new PrintWriter(hurlc.getOutputStream());
			out.println(query);
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(hurlc.getInputStream()));
			PrintWriter pw = new PrintWriter(new FileWriter("daumSearch.txt"));
			String inputLine = null;
			while((inputLine = in.readLine())!=null){
				pw.println(inputLine);
			}
			in.close();
			pw.close();
			System.out.println("검색되 결과가 파일에 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
