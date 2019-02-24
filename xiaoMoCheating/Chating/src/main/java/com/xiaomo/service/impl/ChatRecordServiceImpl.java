package com.xiaomo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xiaomo.entity.ChatRecord;
import com.xiaomo.repository.ChatRecordRepository;
import com.xiaomo.service.ChatRecordService;

/**
 * 
 * @author Jason
 *
 */
@Service("chatRecordService")
public class ChatRecordServiceImpl implements ChatRecordService{

	@Resource
	private ChatRecordRepository chatRecordRepository;
	
	@Override
	public void saveChatRecord(ChatRecord chatRecord) {
		// TODO Auto-generated method stub
		chatRecordRepository.save(chatRecord);
	}

}
