package me.mmuzaf;

public class Main {
    public static void main(String[] args) {
        Object falseSupplier = ((ExtendedSupplier) null).getRow().get(); // Why it's not working? Should return "Row" object
        Row trueSupplier = ((ExtendedSupplier<Object>) null).getRow().get(); //This one works fine!
    }
}
