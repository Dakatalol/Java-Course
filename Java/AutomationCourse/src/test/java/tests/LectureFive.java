package tests;

import mm.Book;
import mm.Search;
import mm.ShoppingBasket;
import mm.User;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LectureFive{

    private ArrayList<Book> bookList = new ArrayList<Book>();
    private Search search;
    @BeforeTest
    public void setUp(){
        search = new Search();
        bookList.add(new Book("Infinity Gauntlet", 9.99, 10, true ));
        bookList.add(new Book("Venom", 42, 25.55, true ));
        bookList.add(new Book("Dr. Strange", 25, 19.99, true ));
        bookList.add(new Book("Spider-Man", 25, 15.99, true ));
        bookList.add(new Book("Avengers", 20, 15.50, true ));
        bookList.add(new Book("Hulk", 10.00, 5.55, true ));
        bookList.add(new Book("Avengers:Infinity war", 25.99, 21.99, false ));
        bookList.add(new Book("Avengers:Endgame", 29.99, 25, false ));
        bookList.add(new Book("Captain America", 49.99, 40, true ));
        bookList.add(new Book("Captain America:Civil War", 49.99, 33.99, false ));
    }

    /**
     * Направете нов тест, в който да има Лист от 10 книги (изборът е ваш за заглавия и цени :) ).
     * Използвайки търсачката от точка 2, намерете съответно книгата с най-малка оригинална цена,
     * третата най-евтина намалена цена, както и книга по заглавие.
     * Разпечатайте намерените резултати в конзолата.
     */
    @Test
    public void firstExercise() {
        double cheapestBookPrice = search.findTheCheapestPrice(bookList);
        System.out.print("The book with the smallest original price is: ");
        search.printFoundBooksByTitle(search.searchByBookPrice(bookList, cheapestBookPrice));
        System.out.print("and the original price is: ");
        System.out.print(cheapestBookPrice);
        System.out.println(" ");

        double cheapestBookDiscountedPrice =  search.sortBooksByPrice(bookList).get(2).getDiscountedPrice();
        System.out.print("The book with the third smallest discounted price is: ");
        search.printFoundBooksByTitle(search.searchByDiscountedPrice(bookList,cheapestBookDiscountedPrice));
        System.out.print("and the discounted price is: ");
        System.out.print(cheapestBookDiscountedPrice);
        System.out.println(" ");

        System.out.print("Search result by title with the word 'captain': ");
        search.printFoundBooksByTitle(search.searchByName(bookList, "captain"));
    }
    /**
     * Направете нов тест:
     * Ползвайки листа от книги от точка 3 и търсачката от малко преди това,
     * намерете книгата с най-малко символи в заглавието и я добавете в кошницата.
     * След това използвайки търсачката намерете книгата с най-висока цена и я добавете в кошницата.
     * Променете quantity-то на последно добавената книга в кошницата на три.
     * Разпечатайте в конзолата общата цена на всички книги в кошницата.
     */
    @Test
    public void secondExercise() {
        ShoppingBasket basket = new ShoppingBasket();

        basket.addToBasket(search.sortBooksByName(bookList).get(0));

        Book mostExpensiveBook = search.sortDescendingBooksByPrice(bookList).get(0);
        basket.addToBasket(mostExpensiveBook);
        basket.changeQuantity(mostExpensiveBook,3);

        basket.printBooksAndQuantityInBasket();
        System.out.println("Total amount of shopping basket: " + basket.returnTotalAmount());
    }
    /**
     * Направете нов тест:
     * Създайте двама нови потребители.
     * Използвайки търсачката добавете в кошницата на първия потребител книгата с най-малка оригинална цена и книгата с най-голяма намалена цена.
     * Използвайки търсачката добавете в кошницата на втория потребител книгата с най-малко думички в заглавието и увеличете quantity-то на тази книга на пет.
     * Разпечатайте за всеки потребител в конзолата - Име, Фамилия, заглавията на добавените книги, количеството им и общата цена.
     */
    @Test
    public void thirdExercise(){
        User firstUser  = new User("Pesho","Peshov");
        User secondUser = new User("Ivan","Ivanov");

        Book cheapestBookByPrice = search.searchByBookPrice(bookList, search.findTheCheapestPrice(bookList)).get(0);
        Book mostExpensiveBookByDiscountedPrice = search.sortDescendingBooksByDiscountedPrice(bookList).get(0);
        firstUser.basket.addToBasket(cheapestBookByPrice);
        firstUser.basket.addToBasket(mostExpensiveBookByDiscountedPrice);

        Book shortestTitleBook = search.sortBooksByName(bookList).get(0);
        secondUser.basket.addToBasket(shortestTitleBook);
        secondUser.basket.changeQuantity(shortestTitleBook,5);

        System.out.println(firstUser.getFirstName() + " " + firstUser.getLastName());
        firstUser.basket.printBooksAndQuantityInBasket();
        System.out.println("Total amount: " + firstUser.basket.returnTotalAmount());

        System.out.println(secondUser.getFirstName() + " " + secondUser.getLastName());
        secondUser.basket.printBooksAndQuantityInBasket();
        System.out.println("Total amount: " + secondUser.basket.returnTotalAmount());
    }
}
