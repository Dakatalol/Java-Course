package mm;

import java.util.List;

public class SearchProductType extends SearchProduct {
    public List<Product> searchType(List<Product> products, String type) {
        searchResult.clear();
        for (Product product : products) {
            if (product.getClass().getSimpleName().equalsIgnoreCase(type)) {
                searchResult.add(product);
            }
        }
        return searchResult;
    }
}
