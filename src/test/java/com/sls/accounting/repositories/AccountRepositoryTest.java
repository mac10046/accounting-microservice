package com.sls.accounting.repositories;

import com.sls.accounting.entities.Account;
import com.sls.accounting.entities.AccountType;
import org.codehaus.jettison.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class AccountRepositoryTest {

    @Autowired
    private MockMvc mockMvc;
    @BeforeEach
    void setUp() {
    }

    @Test
    void findByAccountName() {

    }

    @Test
    void insertAccount() throws Exception {
        Account account = new Account();
        account.setAccountType(AccountType.Revenue);
        account.setAccountName("Customer1");

        ResultActions perform = mockMvc.perform(post("/api/accounting/account")
                .contentType("application/json")
                .content(account.toJsonString()));

                perform.andExpect(status().isCreated());
    }
}