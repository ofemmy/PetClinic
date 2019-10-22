package com.olufemi.petclinic.pet;

import com.olufemi.petclinic.utils.BaseEntity;
import java.time.LocalDate;
import javax.persistence.Entity;

@Entity
public class Pet extends BaseEntity {

  private String petType;
  //private Owner owner;
  private LocalDate birthDate;

  public String getPetType() {
    return petType;
  }

  public void setPetType(String petType) {
    this.petType = petType;
  }

  //public Owner getOwner() {
  // return owner;
  // }

  //public void setOwner(Owner owner) {
  //this.owner = owner;
  //}

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "Pet{" +
        "petType=" + petType +
        ", birthDate=" + birthDate +
        '}';
  }
}
