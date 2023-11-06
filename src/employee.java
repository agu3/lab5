import java.io.*;
public class employee {
    private static Object add;
    String name;
    String email;
    Double hourRate;
    int capacity;
    int freeDays;

    public employee (String name, String email, Double hourRate, int capacity, int freeDays)
    {
    this.name= name;
    this.email=email;
    this.hourRate =hourRate;
    this.capacity=capacity;
    this.freeDays=freeDays;
    }
    public String getName(){return name; }
    public String getEmail(){return email;}
    public Double getHourRate(){return hourRate; }
    public int getCapacity(){return capacity;}
    public int getFreeDays(){return freeDays;}

    public int calculateDailyIncome(double hourRate ,int capacity){
        double dailyIncome = hourRate * capacity;
        return (int) dailyIncome;
    }

    public static void main(String[] args ){
      int s ;
      System.out.println("alex are mere dar rpogramul nu mere");

    }

}


