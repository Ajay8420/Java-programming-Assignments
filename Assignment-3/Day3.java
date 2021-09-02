/*--------------------------Project--------------*/
/*-----------------Cab Fare Calculator--------*/


import java.util.Scanner;
class Cab {
    int fare;
    int d;      //distance travelled by user

    public Cab() {
        fare = 50;
    }

    public Cab(int amt) {
        fare = amt;
    }

    void showfare() {
        System.out.println("Your total Fare is: Rs " + fare);
    }
}

class Rider {
    
    public static void main(String[] args) {
        int cd;     //distance of cab from user
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from the user: ");
        
        cd = sc.nextInt();
        
        if(cd > 10) {
            Cab ob = new Cab(50 + 7 * (cd - 10));
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare = ob.fare + 7 * ob.d;
            
            ob.showfare();
        }
        else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare = ob.fare + 7 * ob.d;
            
            ob.showfare();

        }

        
    }
}
