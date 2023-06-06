## Результат вывода программы в консоль
Добавлены unit-тесты для класса Person:
``` java
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
```
И метода класса Main:
``` java
    @Test
    void test_generateClients() {
        LinkedList<Person> endList = Main.generateClients();
        Assertions.assertEquals(LinkedList.class, endList.getClass());
    }
```