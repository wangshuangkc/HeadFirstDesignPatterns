package handler;

import person.PersonBean;
import sun.plugin.dom.exception.InvalidAccessException;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VisitorInvocationHandler implements InvocationHandler {
  private PersonBean person;

  public VisitorInvocationHandler(PersonBean person) {
    this.person = person;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {
      if (method.getName().startsWith("get")) {
        return method.invoke(person, args);
      } else if (method.getName().equals("setHotOrNotRating")) {
        return method.invoke(person, args);
      } else if (method.getName().startsWith("set")) {
        throw new InvalidAccessException("Not allowed");
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }
}
