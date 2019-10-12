package com.amky.model;

import java.util.ArrayList;
import java.util.List;
 

public class Accounts {
	private List<Account> accountList;
    
    public List<Account> getAccountList() {
        if(accountList == null) {
            accountList = new ArrayList<Account>();
        }
        return accountList;
    }
  
    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
