package Interfaces;

public class Test
{
    public static void main(String... args)
    {
        IGetInfo animalInfo = new Animal(1);
        IGetInfo personInfo = new Person("Frank");
        Animal animal = new Animal(2);
        Person person = new Person("Mark");

        outputInfo(animalInfo);
        outputInfo(personInfo);
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(IGetInfo info)
    {
        info.showInfo();
    }
}
