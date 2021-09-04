import java.lang.String;

public class Dog{

    private int age;
    private String name;

    public Dog(int a, String n){

        age = a;
        name = n;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
