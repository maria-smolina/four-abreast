package com.smolina.fourabreast.database.repository;

import com.smolina.fourabreast.database.model.GameMove;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameMoveRepository extends JpaRepository<GameMove, Integer> {

}
