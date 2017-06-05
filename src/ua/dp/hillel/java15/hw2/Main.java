package ua.dp.hillel.java15.hw2;

import ua.dp.hillel.java15.hw2.interfaces.Animals;

class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(2, "Мурзик", "Сфинкс");
        Dog dog = new Dog(5, "Teddy", "Бигль");
        dog.getInfo();
        cat.getInfo();
    }
}




