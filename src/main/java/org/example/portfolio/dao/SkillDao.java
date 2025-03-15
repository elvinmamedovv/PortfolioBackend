package org.example.portfolio.dao;

import org.example.portfolio.entity.Skill;

import java.util.List;

public interface SkillDao {
    List<Skill> findAll();

}
