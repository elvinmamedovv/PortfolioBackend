package org.example.portfolio.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data

public class Skill {
    Long id;
    String name;
    Long level;
    LocalDateTime createdDate;


}
