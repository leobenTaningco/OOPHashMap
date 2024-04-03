import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.Scanner;


public class BookDA {
    public BookDA(){
        try {
            Scanner inputFile = new Scanner(new FileReader("C:\\Users\\63907\\Desktop\\intellij\\COMVersion\\OOPSeatwork\\src\\book.csv"));
            inputFile.nextLine();
            while (inputFile.hasNext()) {
                String lineData = new String();
                lineData = inputFile.nextLine();
                String[] splitData = new String[3];
                splitData = lineData.split(",");

                Book book = new Book();

                book.setIsbn(splitData[0].trim());
                book.setTitle(splitData[1].trim());
                String authorName = splitData[2].trim();

                //System.out.println(author.getName());
                AuthorDA authorDA = new AuthorDA(authorName);
                // hashmap
                book.setAuthorHashMap(authorDA.getAuthorHashMap());

                //System.out.print("aasdasdasdas");
                System.out.print(book.getIsbn() + " " + book.getTitle());
                for(Map.Entry<String, Author> bookHashMap: book.getAuthorHashMap().entrySet()){
                    System.out.print("\n\t" + bookHashMap.getValue().getName() + "\t-\t");
                    System.out.print(bookHashMap.getValue().getBio() + "\n");

                }
                System.out.println();
            }

        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
