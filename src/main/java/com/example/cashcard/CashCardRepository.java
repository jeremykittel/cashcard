package com.example.cashcard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CashCardRepository extends CrudRepository<CashCard, Long>,
        PagingAndSortingRepository<CashCard, Long> {
    CashCard findCashCardByIdAndOwner(Long id, String owner);
    Page<CashCard> findCashCardByOwner(String owner, PageRequest pageRequest);
    boolean existsCashCardByIdAndOwner(Long id, String owner);
}
