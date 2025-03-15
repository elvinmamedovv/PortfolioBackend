package org.example.portfolio.dto;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SkillDto {
    String name;
    Long level;
    LocalDateTime createdDate;

}
