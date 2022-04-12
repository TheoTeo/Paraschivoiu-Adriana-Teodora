package Decorator.program;

import Decorator.clase.DecoratorAbstract;
import Decorator.clase.DecoratorConcret;
import Decorator.clase.Printer;
import Decorator.clase.PrinterBilet;

public class Main {
    public static void main(String[] args) {
        Printer printer=new PrinterBilet();
        printer.print();
        DecoratorAbstract decoratorAbstract=new DecoratorConcret(printer,"La multi ani, CTS!");
        decoratorAbstract.print();
        decoratorAbstract.printeazaMesaj();
    }
}
