package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int first = p.product(5,6);
        int second = p.product(5,6,7);
        double third = p.product(5.2,6.9);
    }
static class Product{
    public int product(int x, int y) {
    int first = x+y;
    return first;
    }
    public int product(int x, int y, int z) {
    int second = x+y+z;
    return second;
    }
    public double product(double x, double y) {
    double third = x+y;
    return third;
    }
    }
}