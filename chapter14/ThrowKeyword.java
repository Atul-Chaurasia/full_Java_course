class NegativeRadiusException extends Exception {

    public String toString() {
        return "Radius can not be Negative";
    }
    public String toMessage() {
        return "Radius can not be Negative";
    }
}

public class ThrowKeyword {

    static double area(int radius) throws NegativeRadiusException
    {
        if(radius < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        try {
            double result = ThrowKeyword.area(-43);
            System.out.println(result);
        } 
        catch (Exception e) {
            System.out.println(e);    
        }   
    }
}