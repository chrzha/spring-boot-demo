package com.chrzha.springboot.demo.controller;

import com.chrzha.springboot.demo.service.AccountService;
import com.chrzha.springboot.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Chris.Zhang on 4/9/2017.
 */
@Controller
@RequestMapping("/v1")
public class AccountController {

    @Autowired
    public AccountService accountService;

    @RequestMapping(value = "/account/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Account getUserByUsername( String username) {
        Account account = new Account();
        account = accountService.findAccountByUsername(username);
        return account;
    }
}
