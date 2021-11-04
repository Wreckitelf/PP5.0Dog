public class DogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepard", 45);
        Dog JoshJr = new Dog("Josh Jr. ", 6, "German Shepard", 10);

        System.out.println(dog1.getBreed());
        System.out.println(dog1.getAge());
        System.out.println(dog2.getWeight());
        System.out.println(JoshJr.toString());
        System.out.println(Dog.getDogCount());
        if(dog2.compareTo(dog1) == 0)
        {
            System.out.println(dog2.getName() + " is the same age as " + dog1.getName());
        }
        else if(dog2.compareTo(dog1) < 0)
        {
            System.out.println(dog2.getName() + " is younger than " + dog1.getName());
        }
        else
        {
            System.out.println(dog2.getName() + " is older than " + dog1.getName());
        }

        if(dog1.compareTo(JoshJr) == 0)
        {
            System.out.println(dog1.getAge() + " is the same age as " + JoshJr.getAge());
        }
       else if(dog1.compareTo(JoshJr) < 0)
        {
            System.out.println(dog1.getAge() + " is younger than " + JoshJr.getAge());
        }
         else
        {
            System.out.println(dog1.getAge() + " is older than " + JoshJr.getAge());
        }
         //I got the nested ternary operator to work!!
        //System.out.println(dog1.compareTo(JoshJr) == 0 ? dog1.getName() + " is the same age as " + JoshJr.getName()  :  dog1.compareTo(JoshJr) < 0 ? dog1.getName() + " is younger than " + JoshJr.getName() : dog1.getName() + " is older than " + JoshJr.getName());



    }
}
