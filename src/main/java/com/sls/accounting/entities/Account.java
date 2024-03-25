package com.sls.accounting.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private String accountName;
    @NotNull
    private Organization organization;
    @Enumerated(EnumType.STRING)
    @NotNull
    private AccountType accountType;
    @NotNull
    private BigDecimal balance = new BigDecimal(0);


    public String toJsonString() {
        JSONObject object = new JSONObject();
        try {
            object.put("accountId", accountId);
            object.put("accountName", accountName);
            object.put("organization", organization.getOrganizationName());
            object.put("accountType", accountType);
            object.put("balance", balance);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return object.toString();
    }

}
