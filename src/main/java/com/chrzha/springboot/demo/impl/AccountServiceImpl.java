package com.chrzha.springboot.demo.impl;

import com.chrzha.springboot.demo.model.Account;
import com.chrzha.springboot.demo.service.AccountService;

/**
 * Created by Chris.Zhang on 4/9/2017.
 */
public class AccountServiceImpl implements AccountService {

    @Override
    public Account findAccountByUsername(String username) {

        return new Account(1, "root", "abc123_");
    }
}
