package com.example.chatbot.service;

import com.example.chatbot.entity.SpecialRecord;
import java.util.List;
import java.util.Optional;

public interface SpecialRecordService {
    public void addSpecialRecord(SpecialRecord specialRecord);
    public List<SpecialRecord> getAllSpecialRecord();
    public void deleteSpecialRecord(Integer id);
    public Optional<SpecialRecord> getSpecialRecord(Integer id);
    public void modifySpecialRecord(SpecialRecord specialRecord);
}
