package com.sls.accounting.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long organizationId;
    @NotNull
    private String organizationName;
    private String organizationShortName;
    private String organizationAddressLine;
    private String organizationCity;
    private String organizationState;
    private String organizationCountry;
    private String organizationPinCode;
    private String organizationEmail;
    private String organizationPhone;
    private String organizationWebsite;
    private String organizationLogo;


}
