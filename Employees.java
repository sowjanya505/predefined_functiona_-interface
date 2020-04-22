//Progarm to perform Salary Increment for Employees by using Predicate & Function:

   import java.util.*;
   import java.util.function.*;
   class Employees
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

         System.out.println("Before Increment:");
         System.out.println(l);

         Predicate<Employee> p=e->e.salary<3500;
         Function<Employee,Employee> f=e->{
              e.salary=e.salary+477;
              return e;
         };

     System.out.println("After Increment:");
     ArrayList<Employee> l2= new ArrayList<Employee>();
        for(Employee e: l)
        {
            if(p.test(e))
            {
                l2.add(f.apply(e));
            }
         }
         System.out.println(l);
         System.out.println("Employees with  incremented salary:");
         System.out.println(l2);
       }
     public static void populate(ArrayList<Employee> l)
     {
         l.add(new Employee("Sunny",1000));
         l.add(new Employee("Bunny",2000));
         l.add(new Employee("Chinny",3000));
         l.add(new Employee("Pinny",4000));
         l.add(new Employee("Vinny",5000));
         l.add(new Employee("Durga",10000));
     }
 }

Output:

Before Increment:
[Sunny:1000.0, Bunny:2000.0, Chinny:3000.0, Pinny:4000.0, Vinny:5000.0, Durga:10000.0] 

After Increment:
[Sunny:1477.0, Bunny:2477.0, Chinny:3477.0, Pinny:4000.0, Vinny:5000.0, Durga:10000.0] 

Employees with  incremented salary:
[Sunny:1477.0, Bunny:2477.0, Chinny:3477.0]


