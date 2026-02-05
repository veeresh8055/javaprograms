class Pen {
    String brand;
    double price;
    String color;

    void details() {
        System.out.println("Brand : " + brand + "\tPrice" + price + "\tColor : " + color);
    }
}

class main {
    public static void main(String[] args) {
        Pen p1;
        p1 = new Pen();

        p1.brand = "Cello";
        p1.price = 20.00;
        p1.color = "blue";

        p1.details();

        Pen p2 = new Pen();
        p2.brand = "Flair";
        p2.color = "Black";
        p2.price = 30.0;
        p2.details();
    }

}