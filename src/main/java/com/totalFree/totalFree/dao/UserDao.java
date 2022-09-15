package com.totalFree.totalFree.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.totalFree.totalFree.model.UserModel;

@Repository
public interface UserDao extends JpaRepository<UserModel, Long> {

}
