package com.olufemi.petclinic.pet;

import com.olufemi.petclinic.utils.BaseEntity;
import javax.persistence.Entity;

@Entity
public class PetType extends BaseEntity {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
