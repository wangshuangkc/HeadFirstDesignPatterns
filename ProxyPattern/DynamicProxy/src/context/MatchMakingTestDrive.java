package context;

import person.PersonBean;
import person.PersonBeanFactory;
import person.PersonBeanImp;
import person.types.Gender;
import person.types.Person;

import java.util.Arrays;
import java.util.Hashtable;

public class MatchMakingTestDrive {

  private Hashtable<String, PersonBean> db = new Hashtable<>();

  public MatchMakingTestDrive() {
    initializeDatabase();
  }

  private void initializeDatabase() {
    PersonBean joe = new PersonBeanImp();
    joe.setName("Joe Javabean");
    joe.setGender(Gender.MALE);
    joe.setInterests(Arrays.asList("jazz", "tennis"));
    joe.setHotOrNotRating(7);
    db.put(joe.getName(), joe);

    PersonBean kelly = new PersonBeanImp();
    kelly.setName("Kelly Javabean");
    kelly.setGender(Gender.FEMALE);
    kelly.setInterests(Arrays.asList("dota", "lol"));
    kelly.setHotOrNotRating(4);
    db.put(kelly.getName(), kelly);
  }

  public void drive() {
    PersonBean joe = getPersonFromDB("Joe Javabean");
    PersonBean ownerProxy = PersonBeanFactory.getProxy(joe, Person.OWNER);
    printPerson(joe);
    ownerProxy.setInterests(Arrays.asList("bowling", "go"));
    printPerson(joe);
    try {
      ownerProxy.setHotOrNotRating(10);
    } catch (Exception e) {
      System.out.println("Cannot set rating from owner proxy");
    }
    printPerson(joe);

    PersonBean visitorProxy = PersonBeanFactory.getProxy(joe, Person.VISITOR);
    try {
      visitorProxy.setInterests(Arrays.asList("dota", "lol"));
    } catch (Exception e) {
      System.out.println("Cannot set interests from visitor proxy");
    }
    visitorProxy.setHotOrNotRating(3);
    printPerson(joe);
  }

  private PersonBean getPersonFromDB(final String name) {
    return db.get(name);
  }

  private void printPerson(PersonBean person) {
    System.out.println(person.toString());
    System.out.println();
  }

  public static void main(String[] args) {
    final MatchMakingTestDrive test = new MatchMakingTestDrive();
    test.drive();
  }
}
