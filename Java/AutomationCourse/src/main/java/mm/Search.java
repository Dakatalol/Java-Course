package mm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Search {

    public ArrayList<Book> foundListOfBooks= new ArrayList<Book>();

    /**
     *
     * @param bookList - list of books
     * @param searchCriteria - search criteria
     * @return - list of books with found by name
     */
    public ArrayList<Book> searchByName(ArrayList<Book> bookList, String searchCriteria) {
        foundListOfBooks.clear();
        for (Book book : bookList) {
            if (book.getName().toLowerCase().contains(searchCriteria.toLowerCase())) {
                foundListOfBooks.add(book);
            }
        }
        return foundListOfBooks;
    }

    /**
     *
     * @param bookList - list of books
     * @param searchCriteria - search criteria
     * @return - list of books with found by price
     */
    public ArrayList<Book> searchByBookPrice(ArrayList<Book> bookList, double searchCriteria) {
        foundListOfBooks.clear();
        for (Book book : bookList) {
            if (book.getBookPrice() == searchCriteria) {
                foundListOfBooks.add(book);
            }
        }
        return foundListOfBooks;
    }

    /**
     *
     * @param bookList - list of books
     * @param searchCriteria - search criteria
     * @return - list of books with found by discounted price
     */
    public ArrayList<Book> searchByDiscountedPrice(ArrayList<Book> bookList, double searchCriteria) {
        foundListOfBooks.clear();
        for (Book book : bookList) {
            if (book.getDiscountedPrice() == searchCriteria) {
                foundListOfBooks.add(book);
            }
        }
        return foundListOfBooks;
    }
    /**
     *
     * @param bookList - given array list of books
     *                     Method prints found books by title
     */
    public void printFoundBooksByTitle(ArrayList<Book> bookList) {
        for (Book foundBook : bookList) {
            System.out.print(foundBook.getName() + " ");
        }
    }

    /**
     *
     * @param bookList - given array list of books
     * @return - returns the cheapest price of all books
     */
    public double findTheCheapestPrice(ArrayList<Book> bookList) {
        ArrayList<Book> sortedList = (ArrayList<Book>) bookList.stream()
                .sorted(Comparator.comparingDouble(Book::getBookPrice))
                .collect(Collectors.toList());
        return sortedList.get(0).getBookPrice();
    }

    /**
     *
     * @param books - book list
     * @return - returns list of books sorted by name
     */
    public ArrayList<Book> sortBooksByName(ArrayList<Book> books){
        return (ArrayList<Book>) books.stream()
                .sorted(Comparator.comparing(s -> s.getName().length()))
                .collect(Collectors.toList());
    }

    /**
     *
     * @param books - book list
     * @return - returns list of books sorted by book price in descending order
     */
    public ArrayList<Book> sortDescendingBooksByPrice(ArrayList<Book> books){
        return (ArrayList<Book>) books.stream()
                .sorted(Comparator.comparingDouble(Book::getBookPrice).reversed())
                .collect(Collectors.toList());
    }
    /**
     *
     * @param books - book list
     * @return - returns list of books sorted by book discounted price in descending order
     */
    public ArrayList<Book> sortDescendingBooksByDiscountedPrice(ArrayList<Book> books){
        return (ArrayList<Book>) books.stream()
                .sorted(Comparator.comparingDouble(Book::getDiscountedPrice).reversed())
                .collect(Collectors.toList());
    }

    /**
     *
     * @param books - book list
     * @return - returns list of books sorted by book price
     */
    public ArrayList<Book> sortBooksByPrice(ArrayList<Book> books){
        return (ArrayList<Book>) books.stream()
                .sorted(Comparator.comparingDouble(Book::getBookPrice))
                .collect(Collectors.toList());
    }

}
