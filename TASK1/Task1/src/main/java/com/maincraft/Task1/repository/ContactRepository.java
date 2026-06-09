package com.maincraft.Task1.repository;

import com.maincraft.Task1.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Data,String> {
}
