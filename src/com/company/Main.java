package com.company;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String website = "http://erdani.com/tdpl/hamlet.txt";
        String websiteTwo = "https://www.bls.gov/tus/charts/chart9.txt";
        String websiteThree = "http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt";
        System.out.println(urlToString(website));
        for (int = 0; )
    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}