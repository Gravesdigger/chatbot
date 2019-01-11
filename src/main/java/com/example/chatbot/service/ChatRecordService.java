package com.example.chatbot.service;

import com.example.chatbot.entity.ChatRecord;

import java.util.List;
import java.util.Optional;

public interface ChatRecordService {
    public void addChatRecord(ChatRecord chatRecord);
    public List<ChatRecord> getAllChatRecord();
    public void deleteChatRecord(Integer id);
    public Optional<ChatRecord> getChatRecord(Integer id);
    public void modifyChatRecord(ChatRecord chatRecord);
}
