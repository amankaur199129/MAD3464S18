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
public class BANKACCOUNT extends BANK
{
    int AccNo;
    String OwnerName;
    float Balance;
    
    public BANKACCOUNT(String BANKName,int BANKId,int AccNo,String OwnerName,float Balance)
    {
        super(BANKName,BANKId);
        this.AccNo = AccNo;
        this.OwnerName = OwnerName;
        this.Balance = Balance;
    }
    @Override
    public String toString()
    {
        String BANKdetails = super.toString();
        return(super.tostring()+"\n Account Number :" +AccNo +"\n Owner Name :" +OwnerName+"\n Balance :"+Balance);
       
    }
    
}
