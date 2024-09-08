package com.pichincha.account.service.impl;

import static com.pichincha.account.util.AccountConstants.CLIENT_NOT_FOUND_MESSAGE;
import static lombok.AccessLevel.PRIVATE;

import com.pichincha.account.exception.AccountNotFoundException;
import com.pichincha.account.repository.AccountRepository;
import com.pichincha.account.repository.ClientFeignClient;
import com.pichincha.account.service.AccountService;
import com.pichincha.account.service.dto.AccountDto;
import com.pichincha.account.service.dto.ClientDto;
import com.pichincha.account.service.dto.StatusReportDto;
import com.pichincha.account.service.mapper.AccountMapper;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
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

  ClientFeignClient clientFeignClient;
  AccountMapper accountMapper;
  AccountRepository accountRepository;

  private ClientDto findClientByIdentification(String clientIdentification) {
    return Objects.requireNonNull(clientFeignClient.findClientByIdentification(clientIdentification).getBody())
        .orElseThrow(() -> new AccountNotFoundException(String.format(CLIENT_NOT_FOUND_MESSAGE, clientIdentification)));
  }

  @Override
  public void saveAccount(AccountDto accountDto) {
    log.info("Add account for client with identification: {}", accountDto.getClientIdentification());
    ClientDto clientDto = findClientByIdentification(accountDto.getClientIdentification());
    accountDto.setClientId(clientDto.getId());
    accountRepository.save(accountMapper.toEntity(accountDto));
  }

  @Override
  public void saveAccountList(List<AccountDto> accountDtoList) {
    log.info("Add list of accounts: {}", accountDtoList);
    accountDtoList.forEach(this::saveAccount);
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
