package org.example.portfolio.controller;

import org.example.portfolio.dto.SkillDto;
import org.example.portfolio.entity.Skill;
import org.example.portfolio.service.SkillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/skills")
@RestController

public class SkillController {

    private SkillService skillsService;

    @GetMapping
    public List<SkillDto> getSkills() {
     List<SkillDto> skills = skillsService.findAll();
     return skillsService.findAll();


    }

}
