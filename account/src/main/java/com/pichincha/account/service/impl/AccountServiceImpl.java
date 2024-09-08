package com.pichincha.account.service.impl;

import static lombok.AccessLevel.PRIVATE;

import com.pichincha.account.service.AccountService;
import com.pichincha.account.service.dto.AccountDto;
import com.pichincha.account.service.dto.StatusReportDto;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class AccountServiceImpl implements AccountService {

  @Override
  public void saveAccount(AccountDto accountDto) {
    
  }

  @Override
  public void saveAccountList(List<AccountDto> accountDtoList) {

  }

  @Override
  public void updateAccount(Long id, AccountDto accountDto) {

  }

  @Override
  public void deleteAccount(Long id) {

  }

  @Override
  public Optional<AccountDto> findAccountById(Long id) {
    return Optional.empty();
  }

  @Override
  public Optional<AccountDto> findAccountByNumber(String number) {
    return Optional.empty();
  }

  @Override
  public List<AccountDto> findAllAccounts() {
    return null;
  }

  @Override
  public StatusReportDto generateBankStatementReport(LocalDate initialDate, LocalDate endDate, String clientIdentification) {
    return null;
  }
}
