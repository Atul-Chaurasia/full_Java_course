import java.util.Scanner;
class Switchcase
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.print("You have right to give Vote");
                break;
            case 23:
                System.out.print("You can do job now");
                break;
            case 70:
                System.out.print("You become elder");
                break;
                
            default:
                System.out.print("Enjoy your life !");
                break;
               
        }
    }
}