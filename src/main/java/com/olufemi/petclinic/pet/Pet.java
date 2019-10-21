package com.olufemi.petclinic.pet;

import com.olufemi.petclinic.owner.Owner;
import com.olufemi.petclinic.utils.BaseEntity;
import java.time.LocalDate;

public class Pet extends BaseEntity {

  private PetType petType;
  private Owner owner;
  private LocalDate birthDate;

  public PetType getPetType() {
    return petType;
  }

  public void setPetType(PetType petType) {
    this.petType = petType;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

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
        ", owner=" + owner +
        ", birthDate=" + birthDate +
        '}';
  }
}
