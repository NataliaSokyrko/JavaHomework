/*14)Дано файл,  який  містить  відомості  про  книжки.  Відомості  про кожну книгу – це прізвище автора, назва та рік видання. Скласти процедури пошуку: а) назв книг певного автора, виданих із 1960 р.; б) книг  із заданою назвою.
 */


import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class textFiles {
    static String FILE_IN_PATH = "src/task_14.txt";
    
    public static class Books{
        String author;
        String title;
        int year;
        static ArrayList<Books> books;

        public Books(String author, String title,int year){
            this.title=title;
            this.author=author;
            this.year = year;
        }
        
        
        public void addBook(Books newBook){
            books.add(newBook);
        }
        
        public String getTitle(){
            return title;
        }

        public String getAuthor(){
            return author;
        }

        public int getYear(){
            return year;
        }

        public void setTitle(String newtitle){
            this.title=newtitle;
        }

        public void setAuthor(String newauthor){
            this.author=newauthor;
        }


        public String toString(){
          return "Title: \""  + title + "\"" + " written by " + author + "\"" + 
        		  " year" + year + "\n";
        }
    }

    static ArrayList<String> getLinesFromFile(String fileInPath) throws IOException {
        FileReader fr = new FileReader(fileInPath);
        Scanner fileScanner = new Scanner(fr);
        ArrayList<String> linesArray = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            String newLine = fileScanner.nextLine();
            linesArray.add(newLine);
        }
        fr.close();
        return linesArray;
    }


    public static void main(String[] args) throws IOException {
    	ArrayList<String> linesFromFile = getLinesFromFile(FILE_IN_PATH);
        int n = linesFromFile.size();
        Books[] books = new Books[n];
        Iterator<String> iter = linesFromFile.iterator(); 
        int i = 0;
        while (iter.hasNext()) { 
        	String[] words = iter.next().split(" ");
            String author = words[0];
            String title = words[1];
            int year = Integer.parseInt(words[2]);
            books[i] = new Books(author, title, year); 
            i++;
        } 

        
        
        Scanner in = new Scanner (System.in);
        System.out.println("Input author: ");
        String author = in.nextLine();
        System.out.println("Input title: ");
        String title = in.nextLine();
        System.out.println("BOOKS BY GIVEN AUTHOR LIST WHICH WERE PUBLISHED  FROM 1960:");

        for(Books oneBook : books) {
            if (oneBook.getYear() >= 1960 && oneBook.getAuthor() == author)
                {System.out.println(oneBook.toString());
                    System.out.println("=======================================================");
                }
        }
        System.out.println();
        
        System.out.println("BOOKS LIST BY TITLE");
        for(Books oneBook : books) {
            if (oneBook.getTitle() == title)
                {System.out.println(oneBook.toString());
                    System.out.println("=======================================================");
                }
            else {
                System.out.println("Title is not found!");
                }
        System.out.println();
    }
    }
}
