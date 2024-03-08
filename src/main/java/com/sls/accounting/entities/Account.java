package com.sls.accounting.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private String accountName;
    private String organizationId;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private BigDecimal balance = new BigDecimal(0);


    public String toJsonString() {
        JSONObject object = new JSONObject();
        try {
            object.put("accountId", accountId);
            object.put("accountName", accountName);
            object.put("organization", organizationId);
            object.put("accountType", accountType);
            object.put("balance", balance);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return object.toString();
    }

}
