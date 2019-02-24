package com.xiaomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.xiaomo.entity.ChatRecord;

public interface ChatRecordRepository extends JpaRepository<ChatRecord, Integer>,JpaSpecificationExecutor<ChatRecord>{
      
	
}
