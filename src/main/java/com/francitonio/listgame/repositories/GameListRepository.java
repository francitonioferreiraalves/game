package com.francitonio.listgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francitonio.listgame.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
