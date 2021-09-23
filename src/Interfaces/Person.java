package Interfaces;

public class Person implements IGetInfo
{
    private String name;

    public Person (String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        System.out.println("Hello, Everyone!");
    }

    @Override
    public void showInfo()
    {
        System.out.println("My name is: " + this.name);
    }
}
