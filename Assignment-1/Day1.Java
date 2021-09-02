import java.util.Scanner;
class Student {
    public static void main(String[] args){
        int roll;
        String name;
        float marks;
        Scanner sc = new Scanner (System.in);
        name = sc.nextLine();
        roll = sc.nextInt();
        marks = sc.nextFloat();
        
        System.out.println("Student detail:" + name + "," + roll + "," + marks);
        
    }
}