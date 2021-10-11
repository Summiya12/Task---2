package SummiyaHussain;

public class Student {
    int id;
    String name;
    static String universityName;

    Student() //Default Constructor
    {
        universityName = "Leading University";
    }

    Student(String name)
    {
        this.name = name;
        System.out.println("Student's Name: " +name);
    }

    Student(int id)
    {
        this.id = id;
        System.out.println("Student's ID: " +id);
    }

    void display()
    {
        System.out.println("University Name: "+universityName);
    }
}

/*
    Name:Summiya Hussain.
    ID: 2012020077
    Section: B
    Email: cse_2012020077@lus.ac.bd
    Date: 09-08-2021
 */
