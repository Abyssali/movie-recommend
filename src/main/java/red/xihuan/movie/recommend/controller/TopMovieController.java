package red.xihuan.movie.recommend.controller;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;

/**
 * @author : lihong
 * @date : 2018/07/02
 */
public class TopMovieController {
    public static void main(String[] args) {
        String crawlStorageFolder = "/usr/aby/data/crawl/root";
        int numberOfCrawlers = 7;

        CrawlConfig config = new CrawlConfig();
        config.setCrawlStorageFolder(crawlStorageFolder);
    }
}
