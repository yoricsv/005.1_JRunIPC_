package Interfaces;

public class Animal implements IGetInfo
{
    private int animalId;

    public Animal(int id)
    {
        this.animalId = id;
    }

    public void sleep()
    {
        System.out.println("I'm sleeping!");
    }

    @Override
    public void showInfo()
    {
        System.out.println("Animal ID is:" + this.animalId);
    }
}
