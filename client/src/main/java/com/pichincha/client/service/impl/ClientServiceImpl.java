package com.pichincha.client.service.impl;

import com.pichincha.client.service.ClientService;
import com.pichincha.client.service.dto.ClientDto;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {

  @Override
  public void saveClient(ClientDto clientDto) {

  }

  @Override
  public void saveClientList(List<ClientDto> clientDtoList) {

  }

  @Override
  public void updateClient(Long id, ClientDto clientDto) {

  }

  @Override
  public void deleteClient(Long id) {

  }

  @Override
  public Optional<ClientDto> findClientById(Long id) {
    return Optional.empty();
  }

  @Override
  public Optional<ClientDto> findClientByIdentification(String identification) {
    return Optional.empty();
  }

  @Override
  public List<ClientDto> findAllClients() {
    return null;
  }
}
