package com.codegym.repository;

import com.codegym.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
    Iterable<Category> findAllByName(String name);
    Iterable<Category> findAllByNameOrderByName(String name);
}
