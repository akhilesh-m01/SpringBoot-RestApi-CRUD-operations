package com.akhilesh.bankingApp.mapper;

import com.akhilesh.bankingApp.dto.AccountDto;
import com.akhilesh.bankingApp.entity.Account;

public class AccountMapper {

//    mapping object to entity(db)
    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );

        return account;
    }

//    mapping entity(db) to object
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );

        return accountDto;
    }
}
