package com.amky.dao;

import org.springframework.stereotype.Repository;

import com.amky.model.*;

@Repository
public class AccountDAO {
	private static Accounts list = new Accounts();
    
    static
    {
        list.getAccountList().add(new Account(1,"makarchus","Test12","makarchus@yahoo.com","Makarand","Kulkarni","425 Pierce Dr","","Chester Springs",
        									  "PA","19425","6104581803"));
    }
     
    public Accounts getAllAccounts()
    {
        return list;
    }
     
    public void addAccount(Account account) {
        list.getAccountList().add(account);
    }
}
