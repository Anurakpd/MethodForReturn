package Method_Overloading;

public class Whatsapp {

    public void send(int number){
        System.out.println(" this is a number : "+ number);
    }
    public void send(String message){
        System.out.println(" this is a message : "+ message);
    }
    public void send(int number, String message){
        System.out.println(" This is number : "+ number + " this is a message "+ message);
    }
    public void send(String message,int number){
        System.out.println( " this is a message "+ message +" This is number : "+ number );
    }

    public static void main(String[] args) {
        Whatsapp obj = new Whatsapp();
        obj.send(400,"anura");
        obj.send("anura", 400);
        obj.send(400);
    }

}
