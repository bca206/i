//method overreading
import java.util.*;
abstract class departemnt{
    double salary,bonus,totalsalary;
    public abstract void calsaray(double sal); 
    public void  diplaytotalsalary(String name){
         System.out.println("Name="+name+"  Salary="+salary+"  bonus="+bonus+"  totalsalary="+totalsalary);
    }
}
class account extends departemnt{

    public void calsaray(double sal){
        salary=sal;
        bonus=sal*0.3;
        totalsalary=sal + bonus;
    }
}

class sales extends departemnt {
    public void calsaray(double sal){
        salary=sal;
        bonus=sal*0.4;
        totalsalary=sal + bonus;
    }
}


class lab09{
    public static void main(String[] args) {
        departemnt acc=new account(); 
        departemnt sal=new sales();
        acc.calsaray(10000);
        acc.diplaytotalsalary("Account");
        sal.calsaray(10000);
        sal.diplaytotalsalary("Sales");
 }
}