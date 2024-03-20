package com.demo.repository;

import com.demo.entity.DictType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

//public class DictTypeRepository
public interface DictTypeRepository extends JpaRepository<DictType, Long>, JpaSpecificationExecutor<DictType>
{
}
