import java.util.LinkedList;

public class Main {
    public static LinkedList<Person> generateClients(){
        LinkedList<Person> list = new LinkedList<>();
        list.offer(new Person("Vasya","Vasil'ev",2));
        list.offer(new Person("Vanya","Ivanov",1));
        list.offer(new Person("Petya","Petrov",4));
        list.offer(new Person("Grisha","Dauge",1));
        list.offer(new Person("Alesha","Bykov",4));
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Person> queue = generateClients();
        while (!queue.isEmpty()) {
            Person client = queue.poll();
            if (client.getCountOfTickets() >= 1) {
                System.out.println("Клиент " + client.getName() + " " + client.getSurname() + " прокатился на аттракционе");
                client.haveFun();
                queue.offer(client);
            }
        }
    }
}