package Decorator.clase;

public abstract class DecoratorAbstract implements Printer{
    Printer printer;

    public DecoratorAbstract(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        printer.print();
    }

    public abstract void printeazaMesaj();
}
