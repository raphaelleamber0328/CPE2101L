package LE_3;

public class personTest {
    public static void main(String[] args) {
 
        Person p1 = new Person("Humabon", 56);
        Person p2 = new Person("Krisamae", 28);
        Person p3 = new Person("Casandra", 16);
        Person p4 = new Person("Humabon", 56);

        if (p1.equals(p4)) 
        {
            System.out.println("PASS: equals method test");
        } 
        else 
        {
            System.out.println("FAIL: equals method test");
        }

        if (p1.equals(p2)) 
        {
            System.out.println("PASS: equals method test");
        } 
        else
        {
            System.out.println("FAIL: equals method test");
        }

        if (p2.getName().equals("Krisamae") && p2.getAge() == 28) 
        {
            System.out.println("PASS: accessor methods test");
        } 
        else 
        {
            System.out.println("FAIL: accessor methods test");
        }

   
        p3.setName("Lapu-Lapu");
        p3.setAge(45);
        if (p3.getName().equals("Lapu-Lapu") && p3.getAge() == 45) 
        {
            System.out.println("PASS: mutator methods test");
        } 
        else 
        {
            System.out.println("FAIL: mutator methods test");
        }
    }
}
