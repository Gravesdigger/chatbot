package com.example.chatbot.serviceImpl;

import com.example.chatbot.entity.ChatRecord;
import com.example.chatbot.repository.ChatRecordRepository;
import com.example.chatbot.service.ChatRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChatRecordServiceImpl implements ChatRecordService {
    @Autowired
    private ChatRecordRepository chatRecordRepository;

    @Override
    public void addChatRecord(ChatRecord chatRecord){
        chatRecordRepository.save(chatRecord);
    }

    @Override
    public List<ChatRecord> getAllChatRecord(){
        return chatRecordRepository.findAll();
    }

    @Override
    public Optional<ChatRecord> getChatRecord(Integer id){
        return chatRecordRepository.findById(id);
    }

    @Override
    public void deleteChatRecord(Integer id){
        chatRecordRepository.deleteById(id);
    }

    @Override
    @Modifying
    public void modifyChatRecord(ChatRecord chatRecord){
        chatRecordRepository.save(chatRecord);
    }
}
