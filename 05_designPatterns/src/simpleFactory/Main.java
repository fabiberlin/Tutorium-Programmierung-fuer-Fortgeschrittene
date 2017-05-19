package simpleFactory;

public class Main {
    public static void main (String[] args){
        Door door = DoorFactory.makeDoor(90, 210);
        System.out.println("Width: " + door.getWidth());
        System.out.println("Height: " + door.getHeight());
        System.out.println("Instance of Door: "+ (door instanceof Door));
        System.out.println("Instance of WoodenDoor: "+ (door instanceof WoodenDoor));
        System.out.println("Instance of IronDoor: "+ (door instanceof IronDoor));
    }
}
