package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    //@Test
	//@Disabled
    /*public void depositAnAmountToIncreaseTheBalance() {

        assertThat("your first test").isBlank();
    }*/

    @Test
    public void initialAccount_shouldHaveZeroBalance(){
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(0);
    }


}
