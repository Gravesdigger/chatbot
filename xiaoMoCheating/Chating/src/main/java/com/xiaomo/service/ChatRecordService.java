package com.xiaomo.service;

import com.xiaomo.entity.ChatRecord;

/**
 * 聊天记录接口
 * @author Jason
 *
 */
public interface ChatRecordService {
	
	/**
	 * 保存聊天记录
	 * @param chatRecord
	 */
	public void saveChatRecord(ChatRecord chatRecord);
}
