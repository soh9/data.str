class Node {
    String gender;
    String customerType;
    int age;
    String typeOfTravel;
    String flightClass;
    int flightDistance;
    Node next;

    public Node(String gender, String customerType, int age, String typeOfTravel, String flightClass, int flightDistance) {
        this.gender = gender;
        this.customerType = customerType;
        this.age = age;
        this.typeOfTravel = typeOfTravel;
        this.flightClass = flightClass;
        this.flightDistance = flightDistance;
        this.next = null;
    }

}