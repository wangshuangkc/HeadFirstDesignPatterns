package person.types;

public enum Gender {
  FEMALE("female"),
  MALE("male"),
  OTHER("other");

  private String gender;

  Gender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return gender;
  }
}
