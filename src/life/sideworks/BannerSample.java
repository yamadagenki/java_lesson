package life.sideworks;

import life.sideworks.banner.Print;
import life.sideworks.banner.PrintBanner;

/**
 * @author shengboxu
 */

public class BannerSample {
    public static void main(String[] args) {
        Print p = new PrintBanner("It's awesome banner!!");

        p.printWeak();
        p.printStrong();
    }
}
