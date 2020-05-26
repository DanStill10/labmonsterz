package com.labmonsterz.labmonsterz.Dao;

import com.labmonsterz.labmonsterz.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User, UUID> {

}
