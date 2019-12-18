package adapter.extend;

/**
 * @author:thinkpad
 * @date:2019/9/23
 * @desc: TODO
 **/
public class PrintBanner extends Banner implements Print {

    public void printWeak() {
        showWithAster();
    }

    public void printStrong() {
        showWithParen();
    }
}
