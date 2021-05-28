package mm;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ShoppingBasket {
    Map<Book, Integer> basket = new HashMap<>();

    /**
     * @param book - book to be added
     *             Method that adds a book to the shopping basked with default quantity=1 and if the book
     *             already exists it just adds a quantity to it
     */
    public void addToBasket(Book book) {
        basket.put(book, basket.getOrDefault(book, 0) + 1);
    }

    /**
     * @param book     - selected book
     * @param quantity - new quantity value
     *                 Method that changes the quantity of given book
     */
    public void changeQuantity(Book book, int quantity) {
        basket.replace(book, quantity);
    }

    /**
     * @return list of all books in the basket
     */
    public List<Book> returnAllBooksInBasket() {
        List<Book> booksInBasket = new ArrayList<>();
        booksInBasket.addAll(basket.keySet());
        return booksInBasket;
    }

    /***
     *
     * @return total amount of all books in the basket
     */
    public double returnTotalAmount() {
        double totalAmount = 0;
        for (Book book : basket.keySet()) {
            //calculating the total amount based on book price * quantity
            totalAmount = totalAmount + (book.getBookPrice() * basket.get(book));
        }
        return totalAmount;
    }

    /**
     * Method prints books and quantity in the basket
     */
    public void printBooksAndQuantityInBasket() {
        System.out.println("Books in basket:");
        for (Book book : basket.keySet()) {
            String bookName = book.getName();
            String quantity = basket.get(book).toString();
            System.out.println("Book Name:" + bookName + " " + "|" + " " + "Quantity:" + quantity);
        }
    }
}
