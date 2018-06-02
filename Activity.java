/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

/**
 *
 * @author macstudent
 */
public class Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BANKACCOUNT bac1 = new BANKACCOUNT("Canadian bank",11,4444,"amandeep",10000.00f);
        System.out.println(bac1.toString());
    }
    
}
