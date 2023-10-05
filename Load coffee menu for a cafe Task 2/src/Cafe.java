import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    public ArrayList<String> FredrikogMadses = new ArrayList<>();
    public void loadMenuData(){
        File Daniel = new File("src/Coffe.txt");
        try {
            Scanner Benjamin = new Scanner(Daniel);
            while(Benjamin.hasNextLine()){
                FredrikogMadses.add(Benjamin.nextLine());
            }
        }catch (FileNotFoundException Malte){
            System.out.println("File not found");
        }
    }
}
