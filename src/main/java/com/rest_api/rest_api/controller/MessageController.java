package com.rest_api.rest_api.controller;

import com.rest_api.rest_api.entity.Message;
import com.rest_api.rest_api.interfaces.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/messages")
public class MessageController {
    @Autowired
    private MessageRepository repo;

    @PostMapping("")
    public Message addMessage(@RequestBody Message val) {
        return repo.save(val);
    }

    @GetMapping("")
    public List<Message> listMessage(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Message> getMessageById(@PathVariable("id") Integer id){
        return repo.findById(id);
    }

    @PutMapping("")
    public Message updateMessage(@RequestBody Message val){
        return repo.save(val);
    }

    @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable("id") Integer id){
        repo.deleteById(id);
        return "Id : " +id+ " delete";
    }
}
