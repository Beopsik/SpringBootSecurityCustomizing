package com.example.springbootsecuritycustomizing;

import com.example.springbootsecuritycustomizing.account.Account;
import com.example.springbootsecuritycustomizing.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRuuner implements ApplicationRunner{

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account beobsik=accountService.createAccount("beobsik", "1234");
        System.out.println(beobsik.getUsername()+" password: "+beobsik.getPassword());
    }
}
