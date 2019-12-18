package factory.framework;

/**
 * @author:thinkpad
 * @date:2019/9/29
 * @desc: TODO
 **/
public class IDCard extends Product {

    private String owner;
    IDCard(String owner) {
        System.out.println("构建");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用");
    }

    public String getOwner() {
        return owner;
    }
}
