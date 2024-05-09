package com.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entity.BorrowEntity;

@Repository
public interface BorrowRepo extends JpaRepository<BorrowEntity, Integer> {

}
