
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author pranavkundra
 */

class Account
{
    String balance;
    String pin;
    String name;

    public Account() {
    }

    public Account(String balance, String pin, String name) {
        this.balance = balance;
        this.pin = pin;
        this.name=name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

public class Data 
{
    HashMap<String, Account> Account_Details;

    public Data()throws FileNotFoundException, IOException
    {
        this.Account_Details = new HashMap<String, Account>();
        readFromFile();
    }

    public Data(HashMap<String, Account> map) 
    {
        this.Account_Details = map;
    }
    
    private void readFromFile()throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader("Data.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String str="";
        
        while((str=br.readLine())!=null)
        {
            String arr[]=str.split(",");
            String ac_no=arr[0];
            String bal=arr[1];
            String pin=arr[2];
            String name=arr[3];
            
            Account_Details.put(ac_no, new Account(bal, pin, name));
        }
        
        br.close();
        fr.close();
//        System.out.println(map);
    }
    
    public void writeToFile()throws FileNotFoundException, IOException
    {
        FileWriter fw = new FileWriter("Data.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (Map.Entry<String, Account> entry : Account_Details.entrySet())
        {
            Account ob = entry.getValue();
            String str = entry.getKey() + "," + ob.getBalance() + "," + ob.getPin() + "," + ob.getName();
            bw.write(str+"\n");
        }
        
        bw.flush();
        bw.close();
        fw.close();
    }
    
    public String getPIN(String ac_no)
    {
        return Account_Details.containsKey(ac_no.trim())?Account_Details.get(ac_no.trim()).getPin():"InvalidPIN";
    }
    
    public String getBalance(String ac_no)
    {
        return Account_Details.containsKey(ac_no.trim())?Account_Details.get(ac_no.trim()).getBalance():"InvalidBal";
    }
    
    public String getName(String ac_no)
    {
        return Account_Details.containsKey(ac_no.trim())?Account_Details.get(ac_no.trim()).getName():"InvalidName";
    }
    
    public void setPIN(String ac_no, String pin)
    {
        Account ac = Account_Details.containsKey(ac_no.trim())?Account_Details.get(ac_no.trim()):null;
        
        if(ac!=null)
        {
            ac.setPin(pin);
            Account_Details.remove(ac_no.trim());
            Account_Details.put(ac_no.trim(), ac);
        }
    }
    
    public void setBalance(String ac_no, String balance)
    {
        Account ac = Account_Details.containsKey(ac_no.trim())?Account_Details.get(ac_no.trim()):null;
        
        if(ac!=null)
        {
            ac.setBalance(balance);
            Account_Details.remove(ac_no.trim());
            Account_Details.put(ac_no.trim(), ac);
        }
    }
    
    public void setName(String ac_no, String name)
    {
        Account ac = Account_Details.containsKey(ac_no.trim())?Account_Details.get(ac_no.trim()):null;
        
        if(ac!=null)
        {
            ac.setName(name);
            Account_Details.remove(ac_no.trim());
            Account_Details.put(ac_no.trim(), ac);
        }
    }
    
    public void augmentBalance(String ac_no, Integer deposit)
    {
        Account ac = Account_Details.containsKey(ac_no.trim())?Account_Details.get(ac_no.trim()):null;
        
        if(ac!=null)
        {
            int old_balance = Integer.valueOf(ac.getBalance());
            String new_balance = (old_balance+deposit)+"";
            ac.setBalance(new_balance);
            Account_Details.remove(ac_no.trim());
            Account_Details.put(ac_no.trim(), ac);
        }
    }
//    public static void main(String [] args)throws IOException, FileNotFoundException
//    {
//        Data ob = new Data();
//        ob.writeToFile();
//    }
}
