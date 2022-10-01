package a08RegexDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class RegexDemo7 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.fltrace.cn/scanTraceCode/webTracecodeInfo.htm?traceCode=31211257572904837250");
        URLConnection conn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
