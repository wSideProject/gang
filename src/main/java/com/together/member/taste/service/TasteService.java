package com.together.member.taste.service;

import com.together.member.member.model.Member;
import com.together.member.taste.entity.Taste;
import com.together.member.taste.model.TasteDTO;
import com.together.member.taste.repository.TasteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor

public class TasteService {
    private final TasteRepository repository;

    @Transactional
    public Long saveTaste(Taste taste){
        repository.save(taste);
        return taste.getId();
    }
    public List<Taste> findTaste(){
        return repository.findAll();
    }
    public Taste findOne(Long tasteId){
        return repository.findOne(tasteId);
    }

}
