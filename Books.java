/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Books {
  
   int booksID;
   String bookTitle;
   int bookRating;
   
   Books(){
       this.booksID =0;
       this.bookTitle = "Unknown";
       this.bookRating = 0;
   }
    Books(int booksID, String bookTitle,int bookRating){
        this.booksID = booksID;
        this.bookTitle = bookTitle;
        this.bookRating = bookRating;
    }
    void setID(int ID)
    {
        System.out.println("Enter the ID of the book :");
        this.booksID=ID;
    }
    int getID()
    {  
        return booksID;
    }
    void setTitle()
    {
      System.out.println("Enter name of the book :");
      this.bookTitle = bookTitle;
         }
    String getTitle()
    {
        return bookTitle;
    }
    void setrating()
    {
        System.out.println("Enter the rating of the book :");
        this.bookRating = bookRating;
    }
    int getRating()
    {
        return bookRating;
    }
   
    void displayInfo()
    {
        
      System.out.println("BookID :"+this.booksID+"\n BookTitle :"+ this.bookTitle+"\n BooksRating :"+this.bookRating);


}
    
}
class booksTitleComparator implements Comparator<Books>
{
   @Override
   public int compare(Books o1,Books o2)
   {
       return o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
   }
}
class booksratingcomparator implements Comparator<Books>{
    
    @Override
    public int compare(Books o1, Books o2){
        if(o1.bookRating ==o2.bookRating)
            return 0;
        else if(o1.bookRating <o2.bookRating)
            return 1;
        else
            return -1;
       
    }
}
