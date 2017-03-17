package me.jamiechen.exception_and_io;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Web 爬虫，遍历 100 个页面后退出
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        crawler(url);
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraveredURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);

        while (!listOfPendingURLs.isEmpty() && listOfTraveredURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraveredURLs.contains(urlString)) {
                listOfTraveredURLs.add(urlString);
                System.out.println("Crawl " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraveredURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;

            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    }else
                        current = -1;
                }
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
