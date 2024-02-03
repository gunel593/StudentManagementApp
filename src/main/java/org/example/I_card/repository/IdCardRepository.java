package org.example.I_card.repository;

import org.example.I_card.model.entity.IdCard;

import java.util.List;

public interface IdCardRepository {
  List<IdCard>  getAll();
  IdCard getById(Long id);
  boolean insert(IdCard idCard);
  boolean update(IdCard idCard);
  boolean delete(Long id);
}
