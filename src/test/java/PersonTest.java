import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;


class PersonTest {

   Person testClass = new Person("test name", "test surname", 5);

   @Test
   public void test_haveFun(){
      final int startCount = testClass.getCountOfTickets();
      final int expectedCount = startCount - 1;
      testClass.haveFun();
      final int endCount = testClass.getCountOfTickets();
      Assertions.assertEquals(expectedCount, endCount);
   }

   @Test
   public void test_constructorPerson_invalidParameter(){
      Assertions.assertThrows(InvalidParameterException.class,() ->{new Person("test name", "test surname", -1);});
   }

   @Test
   public void test_constructorPerson_correctParameter(){
      final String name = "test name";
      final String surname = "test surname";
      final int countOfTickets = 2;
      final Person testClass = new Person(name, surname, countOfTickets);
      Assertions.assertEquals(name,testClass.getName());
      Assertions.assertEquals(surname,testClass.getSurname());
   }
}