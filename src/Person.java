public class Person {
    private String name;
    private String surname;
    private int countOfTickets;

    public Person(String name, String surname, int countOfTickets){
        this.name = name;
        this.surname = surname;
        this.countOfTickets = countOfTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCountOfTickets() {
        return countOfTickets;
    }

    public void haveFun() {
        this.countOfTickets--;
    }
}
