package ru.fazlyev.cinephile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.fazlyev.cinephile.domain.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
}
