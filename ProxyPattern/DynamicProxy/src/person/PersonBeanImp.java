package person;

import person.types.Gender;

import java.util.List;

public class PersonBeanImp implements PersonBean {

  private String name;
  private Gender gender;
  private List<String> interests;
  private int rating;
  private int cnt = 0;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Gender getGender() {
    return gender;
  }

  @Override
  public List<String> getInterests() {
    return interests;
  }

  @Override
  public int getHotOrNotRating() {
    return rating;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setGender(Gender gender) {
    this.gender = gender;
  }

  @Override
  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  @Override
  public void setHotOrNotRating(int rating) {
    if (rating < 0 || rating > 10) {
      throw new IllegalArgumentException("Invalid rating: " + rating + ". Rating can only be 0 to 10.");
    }
    this.rating = (this.rating + rating) / ++cnt;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n"
        + "Gender: " + gender.toString() + "\n"
        + "Interests: " + interests.toString() + "\n"
        + "Rating: " + rating;
  }
}
