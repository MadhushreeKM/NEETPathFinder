//package com.project.neetpathfinder.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.project.neetpathfinder.model.Message;
//import com.project.neetpathfinder.repository.MessageRepository;
//
//@Service
//public class MessageServiceImpl implements MessageService {
//    
//    @Autowired
//    private MessageRepository messageRepository;
//    
//    @Override
//    public Message saveMessage(Message message) {
//        return messageRepository.save(message);
//    }
//    
//    @Override
//    public List<Message> getAllMessages() {
//        return messageRepository.findAll();
//    }
//}
