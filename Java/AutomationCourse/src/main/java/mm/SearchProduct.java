package mm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SearchProduct {
    protected List<Product> searchResult = new ArrayList<>();

    /**
     * @param productList    - list of products
     * @param searchCriteria - search criteria
     * @return - list of found products by title
     */
    public List<Product> searchByTitle(List<Product> productList, String searchCriteria) {
        searchResult.clear();
        for (Product product : productList) {
            if (product.getTitle().toLowerCase().contains(searchCriteria.toLowerCase())) {
                searchResult.add(product);
            }
        }
        return searchResult;
    }

    public List<Product> searchByGenre(List<Product> productList, String searchCriteria) {
        return productList.stream()
                .filter(p -> p.getGenre().contains(searchCriteria))
                .collect(Collectors.toList());
    }
    public List<Product> searchByRatingRange(List<Product> productList, double startRange, double endRange) {
        return productList.stream()
                .filter(p -> p.getRating()>=startRange && p.getRating()<=endRange)
                .collect(Collectors.toList());
    }
}
