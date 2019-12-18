package adapter.delegate;

import adapter.extend.Banner;

/**
 * 适配器，将Banner适配成Print
 **/
public class PrintBanner extends Print {

    Banner banner;

    public void printWeak() {
        banner.showWithAster();
    }

    public void printStrong() {
        banner.showWithParen();
    }
}
