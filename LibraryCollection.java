
package LibraryCollection;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.omg.CORBA.SystemException;

/**
 *
 * @author kubar_000
 */
public class LibraryCollection {
    public static ArrayList<Books> collection = new ArrayList<Books>();
    public static Books book;
    public static int bPageCountInt;
    public static String bTitle;
    public static String bAuthor;
    public static void main(String args[]){
        mainLooping();
        printLoop();
    }
    public static void mainLooping(){
        boolean keepLooping = true;
        while (keepLooping){
            bTitle = JOptionPane.showInputDialog("Enter Title or quit to quit");
            if ("quit".equals(bTitle.toLowerCase())){
                keepLooping = false;
                break;
            }else{
                bAuthor = JOptionPane.showInputDialog("Enter author");
                String bPageCount = JOptionPane.showInputDialog("Enter pageCount");
                try{ 
                    bPageCountInt = Integer.parseInt(bPageCount);}
                catch(SystemException e) {
                    System.out.println("ERROR PLS ENTER NUMBER "+e);
                }
               
            }
            book = new Books(bAuthor, bTitle, bPageCountInt);
//            book.setAuthor(bAuthor);
//            book.setTitle(bTitle);
//            book.setPageCount(bPageCountInt);
            collection.add(book);
            
        }
        
    }
    public static void printLoop() {
        for (Books i : collection){
            System.out.println(i);
            
        }
            
        
    }
}
