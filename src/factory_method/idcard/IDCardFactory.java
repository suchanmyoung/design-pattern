package factory_method.idcard;

import factory_method.framework.Factory;
import factory_method.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
}
}
