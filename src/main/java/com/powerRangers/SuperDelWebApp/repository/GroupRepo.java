package com.powerRangers.SuperDelWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powerRangers.SuperDelWebApp.model.Group;

import java.util.List;

public interface GroupRepo extends JpaRepository<Group, Long> {
    Group findByName(String name);
}