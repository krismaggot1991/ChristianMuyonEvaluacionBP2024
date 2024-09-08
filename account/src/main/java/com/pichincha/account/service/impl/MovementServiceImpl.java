package com.pichincha.account.service.impl;

import static lombok.AccessLevel.PRIVATE;

import com.pichincha.account.service.MovementService;
import com.pichincha.account.service.dto.MovementDto;
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
public class MovementServiceImpl implements MovementService {

  @Override
  public void saveMovement(MovementDto movementDto) {

  }

  @Override
  public void saveMovementsList(List<MovementDto> movementDtoList) {

  }

  @Override
  public void updateMovement(Long id, MovementDto movementDto) {

  }

  @Override
  public void deleteMovement(Long id) {

  }

  @Override
  public Optional<MovementDto> findMovementById(Long id) {
    return Optional.empty();
  }

  @Override
  public List<MovementDto> findAllMovements() {
    return null;
  }
}
