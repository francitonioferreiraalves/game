package com.francitonio.listgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francitonio.listgame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
