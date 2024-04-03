import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class AuthorDA {
    private HashMap<String, Author> authorHashMap;

    public HashMap<String, Author> getAuthorHashMap() {
        return authorHashMap;
    }

    public void setAuthorHashMap(HashMap<String, Author> authorHashMap) {
        this.authorHashMap = authorHashMap;
    }

    public AuthorDA(String authorName) {

        try {
            Scanner inputFile = new Scanner(new FileReader("C:\\Users\\63907\\Desktop\\intellij\\COMVersion\\OOPSeatwork\\src\\author.csv"));
            authorHashMap = new HashMap<String, Author>();

            //System.out.println("Student number: ");
            inputFile.nextLine();
            while (inputFile.hasNext()) {
                //System.out.println("Student number: asdasdas");
                String lineData = new String();
                lineData = inputFile.nextLine();
                String[] splitData = new String[2];
                splitData = lineData.split(",");

                if (authorName.equals(splitData[0].trim())) {

                    //System.out.println("Student number: qweqwe");
                    Author author = new Author(splitData[0].trim(), splitData[1].trim());
                    author.setName(splitData[0].trim());
                    author.setBio(splitData[1].trim());

                    authorHashMap.put(author.getName(), author);
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
