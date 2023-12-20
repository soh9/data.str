

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Traversal
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println("Gender: " + current.gender +
                    ", Customer Type: " + current.customerType +
                    ", Age: " + current.age +
                    ", Type of Travel: " + current.typeOfTravel +
                    ", Class: " + current.flightClass +
                    ", Flight Distance: " + current.flightDistance);
            current = current.next;
        }
    }

    // Insertion at the end
    public void insert(String gender, String customerType, int age, String typeOfTravel, String flightClass, int flightDistance) {
        Node newNode = new Node(gender, customerType, age, typeOfTravel, flightClass, flightDistance);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Deletion by value
    public void delete(int age) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.age == age) {
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null && current.age != age) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Value not found in the list");
            return;
        }
        prev.next = current.next;
    }

    // Search by age
    public void search(int age) {
        Node current = head;
        while (current != null) {
            if (current.age == age) {
                System.out.println("Found: " +
                        "Gender: " + current.gender +
                        ", Customer Type: " + current.customerType +
                        ", Age: " + current.age +
                        ", Type of Travel: " + current.typeOfTravel +
                        ", Class: " + current.flightClass +
                        ", Flight Distance: " + current.flightDistance);
                return;
            }
            current = current.next;
        }
        System.out.println("Not found");
    }
}