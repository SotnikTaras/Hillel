package ua.dp.hillel.java15.hw2;

import ua.dp.hillel.java15.hw2.interfaces.Animals;

/**
 * Created by user on 28.05.2017.
 */
public class Dog implements Animals
{
    int age;
    String name;
    String breed;

    Dog(int age, String name, String breed)
    {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    Dog(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    Dog(int age)
    {
        this.age = age;
    }

    Dog()
    {

    }
    @Override
    public void getInfo()
    {
        System.out.println("Этой собаке " + age +" лет, ее зовут " + name + ", порода " + breed);
    }
}
