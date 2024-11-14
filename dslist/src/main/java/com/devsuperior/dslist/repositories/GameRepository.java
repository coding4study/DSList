package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Games, Long> {


}
