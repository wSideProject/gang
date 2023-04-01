package com.together.member.taste.repository;

import com.together.member.member.model.Member;
import com.together.member.taste.entity.Taste;
import jakarta.persistence.EntityManager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TasteRepository {

    private final EntityManager em;

    public void save(Taste taste){
        em.persist(taste);
    }

    public Taste findOne(Long id) {
        return em.find(Taste.class, id);
    }

    public List<Taste> findAll(){
        return em.createQuery("select m from Taste m", Taste.class).getResultList();
    }

}
