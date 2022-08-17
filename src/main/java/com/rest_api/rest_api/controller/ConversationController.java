package com.rest_api.rest_api.controller;

import com.rest_api.rest_api.entity.Conversation;
import com.rest_api.rest_api.interfaces.ConversationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/conversations")
public class ConversationController {
    @Autowired
    private ConversationRepository repo;

    @PostMapping("")
    public Conversation addConversation(@RequestBody Conversation val) {
        return repo.save(val);
    }

    @GetMapping("")
    public List<Conversation> listConversation(){
        return repo.findAll();
    }

    @GetMapping("/{user_id}")
    public List<Conversation> getConversationByUserSender(@PathVariable("user_id") Integer userSender){
        return repo.findByUserSender(userSender);
    }

    @PutMapping("")
    public Conversation updateConversation(@RequestBody Conversation val){
        return repo.save(val);
    }

    @PutMapping("/status/{status}")
    public Conversation updateStatusConversation(@RequestBody Conversation val,@PathVariable("status") String status){
        val.setStatus(status);
        return repo.save(val);
    }

    @DeleteMapping("/{id}")
    public String deleteConversation(@PathVariable("id") Integer id){
        repo.deleteById(id);
        return "Id : " +id+ " delete";
    }
}
