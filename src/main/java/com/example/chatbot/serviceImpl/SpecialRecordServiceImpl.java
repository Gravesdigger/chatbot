package com.example.chatbot.serviceImpl;

import com.example.chatbot.entity.SpecialRecord;
import com.example.chatbot.repository.SpecialRecordRepository;
import com.example.chatbot.service.SpecialRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialRecordServiceImpl implements SpecialRecordService {
    @Autowired
    private SpecialRecordRepository specialRecordRepository;

    @Override
    public void addSpecialRecord(SpecialRecord specialRecord){
        specialRecordRepository.save(specialRecord);
    }

    @Override
    public List<SpecialRecord> getAllSpecialRecord(){
        return specialRecordRepository.findAll();
    }

    @Override
    public Optional<SpecialRecord> getSpecialRecord(Integer id){
        return specialRecordRepository.findById(id);
    }

    @Override
    public void deleteSpecialRecord(Integer id){
        specialRecordRepository.deleteById(id);
    }

    @Override
    @Modifying
    public void modifySpecialRecord(SpecialRecord specialRecord){
        specialRecordRepository.save(specialRecord);
    }
}
