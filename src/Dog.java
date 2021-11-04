public class Dog implements Comparable
{
    private String name;
    private int age;
    private String breed;
    private double weight; //weight in pounds
    private static int dogCount;

    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    }

    public Dog()
    {
        this.name = "";
        this.age = 0;
        this.breed = "";
        this.weight = 0.0;
        dogCount++;
    }

    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getBreed()
    {
        return this.breed;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public static int getDogCount() { return dogCount; }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double toKilograms()
    {
        double weightInKilo;
        weightInKilo = Math.floor((weight * 0.453592) * 100);
        weightInKilo /= 100;
        return weightInKilo;
    }

    public String toString()
    {
        return "Name: " + name +
                "\nAge: " + age +
                "\nBreed: " + breed +
                "\nWeight: " + weight;
    }

    @Override
    public int compareTo(Object obj)
    {
        int output = 0;
        if(this.age < ((Dog)obj).getAge())
        {
            output = -1;
        }
        else if(this.age > ((Dog)obj).getAge())
        {
            output = 1;
        }
        return output;
    }
}
