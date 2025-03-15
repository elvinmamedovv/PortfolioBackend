package org.example.portfolio.dao.jpaimpl;

import lombok.RequiredArgsConstructor;
import org.example.portfolio.dao.SkillDao;
import org.example.portfolio.entity.Skill;
import org.example.portfolio.repository.SkillRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class SkillDaoJpaImpl implements SkillDao {
    private final SkillRepository skillRepository;

    @Override
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

}
