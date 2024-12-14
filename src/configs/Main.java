package configs;

public class Main {
    public static void main(String[] args) {
    Node n1 = new Node("A");
    Node n2 = new Node("B");
    Node n3 = new Node("C");

    // יצירת גרף עם מעגל
    n1.addEdge(n2);
    n2.addEdge(n3);
    n3.addEdge(n1);

    System.out.println("Has Cycle: " + n1.hasCycles()); // פלט: true

    // גרף ללא מעגלים
    Node n4 = new Node("D");
    n2.addEdge(n4);

    System.out.println("Has Cycle: " + n4.hasCycles()); // פלט: false
}
}
