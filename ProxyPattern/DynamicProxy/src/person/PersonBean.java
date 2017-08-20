package person;

import person.types.Gender;

import java.util.List;

public interface PersonBean {
  public String getName();
  public Gender getGender();
  public List<String> getInterests();
  public int getHotOrNotRating();

  public void setName(String name);
  public void setGender(Gender gender);
  public void setInterests(List<String> interests);
  public void setHotOrNotRating(int rating);
}
