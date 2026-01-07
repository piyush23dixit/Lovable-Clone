package com.example.lovable_clone.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;

    String name;

    String stripePriceId;

    Integer maxProjects;

    Integer maxTokensPerDay;

    Integer maxPreviews;

    Boolean unlimitedAi;

    Boolean active;

}
