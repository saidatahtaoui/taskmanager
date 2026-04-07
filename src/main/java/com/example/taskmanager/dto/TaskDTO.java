package com.example.taskmanager.dto;

import com.example.taskmanager.enums.Category;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private Category category;
    private boolean isCompleted;
}
