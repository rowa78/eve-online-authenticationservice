package de.ronnywalter.eve.accountservice.repository;

import de.ronnywalter.eve.accountservice.model.EveCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CharacterRepository extends JpaRepository<EveCharacter, Integer> {
    Optional<EveCharacter> findByName(String name);
}
