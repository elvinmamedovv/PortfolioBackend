package org.example.portfolio.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Achievement {
    Long id;
    String title;
    String description;
    LocalDateTime createdDate;

}
