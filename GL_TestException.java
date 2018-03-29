public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Something is going wrong. Please contact system administrator.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } finally {
            System.out.println("Finally block has been executed.");
        }

        MyTest myTest = new MyTest();
        try {
            myTest.Test();
        } catch (MyException e) {
            e.printMessage();
        }
    }
}

public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public void printMessage()
    {
        System.out.println(this.message);
    }
}

public class MyTest {
    public void Test() throws MyException{
        throw new MyException("Exception message");
    }
}
