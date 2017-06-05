package ua.dp.hillel.java15.hw2;

import ua.dp.hillel.java15.hw2.interfaces.Animals;

/**
 * Created by user on 28.05.2017.
 */
public class Cat implements Animals
{
    int age;
    String name;
    String breed;

    Cat(int age, String name, String breed)
    {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    Cat(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    Cat(int age)
    {
        this.age = age;
    }

    Cat()
    {

    }

    @Override
    public void getInfo()
    {
        System.out.println("Этой кошке " + age +" лет, ее зовут " + name + ", порода " + breed);
    }
}
