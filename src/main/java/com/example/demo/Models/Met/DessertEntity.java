package com.example.demo.Models.Met;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
@DiscriminatorValue("Dessert")
public class DessertEntity extends MetEntity{

}
