/*
 * Creative Commons Attribution-NonCommercial 3.0 Australia license ( CC BY-NC 3.0 AU)
 * http://creativecommons.org/licenses/by-nc/3.0/au/legalcode  * 
 */

package LibraryCollection;

/**
 *
 * @author kubar_000
 */
public class Books {
    private String bTitle;
    private String bAuthor;
    private int bPageCount;

    
    
    Books(String bTitle, String bAuthor, int bPageCount){
        this.bTitle = bTitle;
        this.bAuthor = bAuthor;
        this.bPageCount = bPageCount;
    }

    public String getTitle() {
        return bTitle;
    }

    public String getAuthor() {
       return bAuthor;
    }

    public int getPageCount() {
        return this.bPageCount;
    }
    public void setTitle(String bTitle){
        this.bTitle = bTitle;
    }
    public void setAuthor(String bAuthor){
        this.bAuthor = bAuthor;
    }
    public void setPageCount(int bPageCount){
        this.bPageCount = bPageCount;
    }
    @Override
    public String toString(){
        return("Title: "+bTitle+" Author: "+bAuthor+" page count: "+bPageCount);
    }
    

    
}
