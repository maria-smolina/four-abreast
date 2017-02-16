package com.smolina.fourabreast.database.repository;

import com.smolina.fourabreast.database.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
