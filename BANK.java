/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class BANK {
    String BANKname;
    int BANKeID;
   Scanner in =new Scanner(System.in);
//   default constructor
   BANK(String BANKname, int BANKeID)
   {
      this.BANKname = BANKname;
      this.BANKeID = BANKeID;
   }
   void setname()
   {
       System.out.println("enter name :");
       this.BANKname =in.nextLine();
   }
   String getname()
   {
       return this.BANKname;
   }
   void setID()
   {
       System.out.println("enter eID :");
       this.BANKeID = in.nextInt();
   }
   int getID()
   {
       return this.BANKeID;
   }
   void setdata()
   {
       setname();
       setID();
   }
   public String tostring()
   {
       String BANKdetails ="bank name :"+ BANKname +"\n BANK eID :" + BANKeID;
       return BANKdetails;
       
       
   }
}