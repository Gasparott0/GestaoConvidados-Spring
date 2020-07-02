package com.gasparotto.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasparotto.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
