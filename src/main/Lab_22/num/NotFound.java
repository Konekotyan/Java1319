package main.Lab_22.num;

public class NotFound extends Exception{
    public NotFound(String info){
        super("Student " + info + " is not found");
    }
}
