package org.example;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���������� ������� �������:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();
        System.out.println("������� ���������� ������� �������:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();



        Vector vector1 = new Vector(x1,y1,z1);
        Vector vector2 = new Vector(x2,y2,z2);
        System.out.println("����� ������� �������:");
        System.out.println(vector1.getVectorLen());

        System.out.println("����� ������� �������:");
        System.out.println(vector2.getVectorLen());

        System.out.println("����� ��������:");
        System.out.println(vector2.getVectorSimpleOperations(vector1, '+'));

        System.out.println("�������� ������� � ������� ��������:");
        System.out.println(vector1.getVectorSimpleOperations(vector2, '-'));

        System.out.println("��������� ������������:");
        System.out.println(vector1.getVectorProd(vector2));

        System.out.println("��������� ������������:");
        System.out.println(vector1.getVectorScalar(vector2));

        System.out.println("������� ����:");
        System.out.println(vector1.getVectorAngle(vector2));
    }

}