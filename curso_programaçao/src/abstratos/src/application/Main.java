package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();


        //========================================================================
        System.out.print("Enter the number of shapes: ");
        int shapes = entrada.nextInt();

        entrada.nextLine();

        //========================================================================

        for (int i = 1 ; i <= shapes; i++){
            System.out.println("Shape #" + i + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");
            char rc = entrada.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(entrada.next());

            if (rc == 'r'){
                System.out.print("Width: ");
                double width = entrada.nextDouble();

                System.out.print("Heigth: ");
                double heigth = entrada.nextDouble();

                list.add(new Rectangle(color,width,heigth));

            } else{
                System.out.print("Radius: ");
                double radius = entrada.nextDouble();

                list.add(new Circle(color,radius));
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS:");

        for (Shape shape: list){
            System.out.println(String.format("%.2f", shape.area()));
        }

        //========================================================================


        entrada.close();
    }
}
