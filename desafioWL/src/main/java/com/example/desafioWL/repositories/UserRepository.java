package com.example.desafioWL.repositories;

import java.util.List;
//aqui é salvo os dados do banco 

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.desafioWL.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
