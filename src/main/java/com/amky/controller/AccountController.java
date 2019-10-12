package com.amky.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
 
import com.amky.dao.AccountDAO;
import com.amky.model.Account;
import com.amky.model.Accounts;
 
@RestController
@RequestMapping(path = "/accounts")
public class AccountController {

	@Autowired
    private AccountDAO accountDao;
     
    @GetMapping(path="/", produces = "application/json")
    public Accounts getAccounts()
    {
        return accountDao.getAllAccounts();
    }
     
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addAccount(@RequestBody Account account)
    {
        Integer id = accountDao.getAllAccounts().getAccountList().size() + 1;
        account.setId(id);
         
        accountDao.addAccount(account);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(account.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
    }
	
}
