package com.pichincha.client.service.impl;

import static lombok.AccessLevel.PRIVATE;

import com.pichincha.client.domain.entity.Client;
import com.pichincha.client.repository.ClientRepository;
import com.pichincha.client.service.ClientService;
import com.pichincha.client.service.dto.ClientDto;
import com.pichincha.client.service.mapper.ClientMapper;
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
public class ClientServiceImpl implements ClientService {

  ClientRepository clientRepository;
  ClientMapper clientMapper;

  @Override
  public void saveClient(ClientDto clientDto) {
    log.info("Add new client with identification: {}", clientDto.getIdentification());
    clientRepository.save(clientMapper.toEntity(clientDto));
  }

  @Override
  public void saveClientList(List<ClientDto> clientDtoList) {
    log.info("Add list of clients: {}", clientDtoList);
    List<Client> clients = clientDtoList.stream().map(clientMapper::toEntity).toList();
    clientRepository.saveAll(clients);
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
