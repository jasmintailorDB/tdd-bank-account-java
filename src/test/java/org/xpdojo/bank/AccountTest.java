package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void initialAccount_shouldHaveZeroBalance(){
        assertThat(Account.emptyAccount().balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmount_shouldIncreaseBalanceBySomeAmount(){
        Account account=Account.emptyAccount();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleAmounts_shouldIncreaseBalanceByBothAmounts(){
        Account account = Account.emptyAccount();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }
}
