package com.chrzha.springboot.demo.service;

import com.chrzha.springboot.demo.model.Account;

/**
 * Created by Chris.Zhang on 4/9/2017.
 */
public interface AccountService {
    public Account findAccountByUsername(String username);
}
