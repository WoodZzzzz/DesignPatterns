package factory.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:thinkpad
 * @date:2019/9/29
 * @desc: TODO
 **/
public class IDCardFactory extends Factory {

    private List owners = new ArrayList<>();

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard)p).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
}
