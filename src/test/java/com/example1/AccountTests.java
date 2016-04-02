package com.example1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by j1012810 on 4/1/2016.
 */
public class AccountTests {
    String name;
    Double balance;
    Account account;
    @Before
    public void setUp() throws Exception {
        balance = 1000.0;
        name = "testName";
        account = new Account(name, balance);
    }
    @Test
    public void withdrawShouldDeductAmountFromBalance() throws Exception {
        account.withdraw(400.0);
        Assert.assertEquals(600.0, account.getBalance(),0.01);
    }

    @Test(expected = Exception.class)
    public void withdrawShouldThrowExceptionIncaseOfInSufficientBalance() throws Exception {
         account.withdraw(1400.0);
    }

    @Test(expected = Exception.class)
    public void shouldThrowIllegalArgumentException() throws Exception {
        account.withdraw(-1000);
    }

    @Test
    public void depositShouldAddTheAmountToBalance() throws Exception {
        account.deposit(100);
        Assert.assertEquals(1100, account.getBalance(), 0.01);
    }

    @Test(expected = Exception.class)
    public void depositShouldThrowIllegalArgumentException() throws Exception {
        account.deposit(-100);
    }



}
