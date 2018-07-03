package red.xihuan.movie.recommend.factory;

import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import red.xihuan.movie.recommend.crawler.TopMovieCrawler;

/**
 * @author : lihong
 * @date : 2018/07/03
 */
public class CsiCrawlerControllerFactory implements CrawlController.WebCrawlerFactory {

    /*private Map<String, String> metadata;

    public CsiCrawlerControllerFactory(Map<String, String> metadata) {
        this.metadata = metadata;
    }*/

    @Override
    public WebCrawler newInstance() throws Exception {
        return new TopMovieCrawler();
    }
}
