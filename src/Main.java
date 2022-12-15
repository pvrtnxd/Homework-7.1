import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1.0");
        int [] weight = new int [3] ;
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weight[i]);
        }

        System.out.println("Задание 1.1");
        double [] opa = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(opa[i]);
        }

        System.out.println("Задание 1.2");
        double [] myVer = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8};
        for (int i = 0; i < 8; i++) {
            System.out.println(myVer[i]);
        }

        System.out.println("Задание 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }}
        System.out.println();
        for (int i = 0; i < opa.length; i++) {
            System.out.print(opa[i]);
            if (i != opa.length - 1) {
                System.out.print(", ");
            }}
        System.out.println();
        for (int i = 0; i < myVer.length; i++) {
            System.out.print(myVer[i]);
            if (i != myVer.length - 1) {
                System.out.print(", ");
            }}
        System.out.println();

        System.out.println("Задание 3");
        for (int i = weight.length -1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }}
        System.out.println();
        for (int i = opa.length -1; i >= 0; i--) {
            System.out.print(opa[i]);
            if (i != 0) {
                System.out.print(", ");
            }}
        System.out.println();
        for (int i = myVer.length -1; i >= 0; i--) {
            System.out.print(myVer[i]);
            if (i != 0) {
                System.out.print(", ");
            }}
        System.out.println();

        System.out.println("Задание 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0 ) {
                weight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weight));


    }
}