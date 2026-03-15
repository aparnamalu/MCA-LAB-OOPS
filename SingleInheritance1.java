class Inheritance        // Parent class
{
    int id = 101;
    String ename = "Malu";
}

class Child extends Inheritance  // Child class
{
    int age = 25;

    void putdata()
    {
        System.out.println("ID.: " + id);
        System.out.println("Ename.: " + ename);
        System.out.println("Age: " + age);
    }
}

class SingleInheritance1
{
    public static void main(String args[])
    {
        Child ob = new Child();
        ob.putdata();
    }
}