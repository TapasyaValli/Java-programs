class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
public class internal14b {
    public static void main(String[] args){
        try{
            int age=-5;
            int a=10/0;

            if(age<0){
                throw new MyException("Age cannot be negative");
            }

        }
        catch(ArithmeticException e){
            System.out.print("Divide by zero");
        }
        catch(MyException e){
            System.out.print(e.getMessage());
        }
        catch(Exception e){
            System.out.print("General Exception");
        }
    }
    
}
