package red.xihuan.movie.recommend.controller;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;
import red.xihuan.movie.recommend.crawler.TopMovieCrawler;

/**
 * @author : lihong
 * @date : 2018/07/02
 */
public class TopMovieController {
    public static void main(String[] args) throws Exception {
        String crawlStorageFolder = "/usr/aby/data/crawl/root";
        int numberOfCrawlers = 7;

        CrawlConfig config = new CrawlConfig();
        config.setCrawlStorageFolder(crawlStorageFolder);

        PageFetcher fetcher = new PageFetcher(config);
        RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
        RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, fetcher);
        CrawlController controller = new CrawlController(config, fetcher, robotstxtServer);

        controller.addSeed("https://movie.douban.com/");
        controller.addSeed("https://movie.douban.com/chart");
        controller.addSeed("https://movie.douban.com/explore#!type=movie&tag=%E8%B1%86%E7%93%A3%E9%AB%98%E5%88%86&sort=recommend&page_limit=20&page_start=0");

        controller.start(TopMovieCrawler.class, numberOfCrawlers);
    }
}
