package day13;


public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        User Alex = new User("Alex");
        User Max = new User("Max");
        User Jade = new User("Jade");

        Alex.sendMessage(Max, "Привет!, как дела?");
        Alex.sendMessage(Max, "Встречаеся в парке атракционов в 17, верно??");
        Max.sendMessage(Alex, "Здорово!");
        Max.sendMessage(Alex, "Да, всё верно");
        Max.sendMessage(Alex, "Свяжись с Джедоном, узнай что там у него?");
        Jade.sendMessage(Alex, "Чего молчим, время на подходе");
        Jade.sendMessage(Alex, "Нам нужно поторапливаться");
        Jade.sendMessage(Alex, "Кристина долго не продержится");
        Alex.sendMessage(Jade, "Только собирался тебе писать");
        Alex.sendMessage(Jade, "Встречаемся в парке атракционов в 17");
        Alex.sendMessage(Jade, "Бери всё что есть");
        Jade.sendMessage(Alex, "Принято, выдвигаюсь");

        MessageDatabase.showDialog(Alex, Jade);
    }
}
