//Progarm to find Total Monthly Salary of All Employees by using Function:
    
import java.util.*;
import java.util.function.*;
    class Employee
    {
        String name;
        double salary;
        Employee(String name,double salary)
        {
            this.name=name;
         this.salary=salary;
     }
     public String toString()
     {
         return name+":"+salary;
     }
 }
 class Test
 {
     public static void main(String[] args)
     {
         ArrayList<Employee> l= new ArrayList<Employee>();
         populate(l);
         System.out.println(l);
         Function<ArrayList<Employee>,Double> f= l1 ->{
             double total=0;
             for(Employee e: l1)
             {
                 total=total+e.salary;
             }
             return total;
         };
         System.out.println("The total salary of this month:"+f.apply(l));
     }

     public static void populate(ArrayList<Employee> l)
     {
         l.add(new Employee("Sunny",1000));
	 l.add(new Employee("Bunny",2000));
	 l.add(new Employee("Chinny",3000));
	 l.add(new Employee("Pinny",4000));
	 l.add(new Employee("Vinny",5000));
      }
 }

output ::

[Sunny:1000.0, Bunny:2000.0, Chinny:3000.0, Pinny:4000.0, Vinny:5000.0] 
The total salary of this month:15000.0
