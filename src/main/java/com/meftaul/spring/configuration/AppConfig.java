package com.meftaul.spring.configuration;

import com.meftaul.spring.service.AccountService;
import com.meftaul.spring.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService getUserService() {
        return new UserService();
    }

    @Bean
    public AccountService getAccountService() {
        return new AccountService(getUserService());
    }

}
