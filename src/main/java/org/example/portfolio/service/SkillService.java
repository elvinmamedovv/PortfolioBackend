package org.example.portfolio.service;


import lombok.RequiredArgsConstructor;
import org.example.portfolio.dao.SkillDao;
import org.example.portfolio.dto.SkillDto;
import org.example.portfolio.entity.Skill;
import org.example.portfolio.mapper.SkillMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillService {
    private final SkillDao skillDao;
    private final SkillMapper skillMapper;

    public List<SkillDto> findAll() {
        List <Skill> skills = skillDao.findAll();
        return skillMapper.toDtoList(skills);

    }
}
