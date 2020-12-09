import java.util.ArrayList;
import java.util.Scanner;

/* OOP Task1_5: Book: id, Назва, Автор (и), Видавництво, Рік видання, Кількість стра-ниць, Ціна, Тип переплета.
Створити масив об'єктів. Вивести: a) список книг заданого автора; b) список книг, випущених заданим видавництвом; 
c) список книг, випущених після заданого року.
*/

public class Book {
    public static class Books{
    	String storeName;
        int id;
        String title;
        String author;
        String publisher;
        int year;
        int numPages;
        int price;
        String binding;
        static ArrayList<Book> books;

        public Books(int id,String title,String author,String publisher,int year,int numPages,int price,String binding){
            this.id=id;
            this.title=title;
            this.author=author;
            this.publisher=publisher;
            this.year = year;
            this.numPages=numPages;
            this.price=price;
            this.binding=binding;
        }

        
        public Books(String storeName) {
            this.storeName = storeName;
            books = new ArrayList<Book>();      
        }

        public void addBook(Book newBook){
            books.add(newBook);
        }
        
        public String getTitle(){
            return title;
        }

        public String getAuthor(){
            return author;
        }

        public String getPublisher(){
            return publisher;
        }

        public int getYear(){
            return year;
        }

        public int getId(){
            return id;
        }

        public int  getNumPages(){
            return numPages;
        }

        public int getPrice() {
            return price;
        }
        public String getBinding() {
        	return binding;
        }

        public void setId(int newid){
            this.id = newid;
        }

        public void setTitle(String newtitle){
            this.title=newtitle;
        }

        public void setAuthor(String newauthor){
            this.author=newauthor;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public void setYear(int year){
            this.year=year;
        }

        public void setNumPages(int numPages){
            this.numPages=numPages;
        }

        public void setPrice(int price){
            this.price=price;
        }

        public void setBinding(String binding){
            this.binding=binding;
        }


        public String toString(){
          return "Book No: " + id + " entitled \""  + title + "\"" + " written by " + author + "\"" + 
        		  " published by " + publisher + " year" + year + " number of pages is  " + numPages + 
        		  " price is " + price + " binding is " + binding + "\n";
        }
    }


       
    public static void main(String[] args) {
        Books[] books = new Books[5];
        books[0] = new Books(34445,"4321", "Paul Auster","Publ", 2017, 1000 , 50 ,"hard");
        books[1] = new Books(346745,"Shantaram", "Gregory Roberts","Publish",  2003, 50, 40, "hard");
        books[2] = new Books(348845,"Martin Eden", "Jack London","Folio",1909,300, 60, "soft");
        books[3] = new Books(444445,"Steve Jobs", "Walter Isaacson","Max",2012,600,120,"hard");
        books[4] = new Books(348845,"Papillon", "Henri Charrière","Folio", 2000,500, 100,"soft");

        Scanner in = new Scanner (System.in);
        System.out.println("Input an author: ");
        String author = in.nextLine();
        System.out.println("Input a publisher: ");
        String publisher = in.nextLine();
        System.out.println("Input year: ");
        int year = in.nextInt();
        in.close();
        
        System.out.println("BOOKS LIST BY AUTHOR " + author);
        for(Books oneBook : books) {
            if (oneBook.getAuthor()  == author)
                {System.out.println(oneBook.toString());
                    System.out.println("=======================================================");
                }
        }
        System.out.println();
        System.out.println("BOOKS LIST BY PUBLISHER" + publisher);

        for(Books oneBook : books) {
            if (oneBook.getPublisher() == publisher)
                {System.out.println(oneBook.toString());
                    System.out.println("=======================================================");
                }
        }
        System.out.println();
        
        System.out.println("BOOKS LIST WHICH WERE PUBLISHED  AFTER " + year);

        for(Books oneBook : books) {
            if (oneBook.getYear() > year)
                {System.out.println(oneBook.toString());
                    System.out.println("=======================================================");
                }
        }
        System.out.println();

    }
	

}

