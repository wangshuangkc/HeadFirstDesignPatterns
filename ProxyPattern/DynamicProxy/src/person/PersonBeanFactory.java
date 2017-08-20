package person;

import handler.OwnerInvocationHandler;
import handler.VisitorInvocationHandler;
import person.PersonBean;
import person.types.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class PersonBeanFactory {

  public static PersonBean getProxy(PersonBean person, Person type) {
    InvocationHandler handler ;
    switch(type) {
      case OWNER:
        handler = new OwnerInvocationHandler(person);
        break;
      case VISITOR:
        handler = new VisitorInvocationHandler(person);
        break;
      default:
        throw new IllegalArgumentException("No such person type: " + type.getClass());
    }

    return (PersonBean) Proxy.newProxyInstance(
        person.getClass().getClassLoader(),
        person.getClass().getInterfaces(),
        handler);
  }
}
