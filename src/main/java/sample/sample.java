package sample;

import java.net.*;
import java.io.*;

/**
 * Created by cgiridhar on 16/03/15.
 */
public class sample {

    public static void main(String[] args) throws IOException {

        URL yahoo = new URL("http://ip-api.com/json/" + args[0]);
        URLConnection yc = null;
        try {
            yc = yahoo.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

    }
}
