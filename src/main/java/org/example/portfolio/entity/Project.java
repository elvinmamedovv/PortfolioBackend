package org.example.portfolio.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    String id;
    String title;
    String description;
    LocalDateTime createdDate;

}
