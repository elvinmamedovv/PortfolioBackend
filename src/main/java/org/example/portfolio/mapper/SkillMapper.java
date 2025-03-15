package org.example.portfolio.mapper;

import org.example.portfolio.dto.SkillDto;
import org.example.portfolio.entity.Skill;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SkillMapper {
List<SkillDto> toDtoList(List<Skill> skills);
Skill toDto(Skill skill);
}
