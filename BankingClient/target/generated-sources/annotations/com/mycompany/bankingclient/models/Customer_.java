package com.mycompany.bankingclient.models;

import com.mycompany.bankingclient.models.BankAccount;
import com.mycompany.bankingclient.models.Transaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-25T07:29:16")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile CollectionAttribute<Customer, Transaction> transactionCollection;
    public static volatile CollectionAttribute<Customer, BankAccount> bankAccountCollection;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, Integer> cusId;
    public static volatile SingularAttribute<Customer, String> securityAnswer;
    public static volatile SingularAttribute<Customer, String> securityQuestion;
    public static volatile SingularAttribute<Customer, Integer> mobile;
    public static volatile SingularAttribute<Customer, String> fullName;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> passcode;

}