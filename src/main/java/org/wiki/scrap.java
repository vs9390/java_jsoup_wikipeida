package org.wiki;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class scrap {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://en.wikipedia.org/wiki/Delhi").get();
        log(doc.title());
        Element paragraph = doc.selectFirst("#mw-content-text > div > p:nth-child(7)");
        log("%s\n\t", paragraph.text());
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}