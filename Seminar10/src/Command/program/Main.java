package Command.program;

import Command.clase.Autobuz;
import Command.clase.ComandaPlecareTraseu;
import Command.clase.Command;
import Command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Autobuz autobuz1=new Autobuz("audi");
        Autobuz autobuz2=new Autobuz("bmw");

        ComandaPlecareTraseu comandaPlecareTraseu=new ComandaPlecareTraseu(1,autobuz1);
        operator.invoca(comandaPlecareTraseu);

        operator.invoca(new ComandaPlecareTraseu(2,autobuz2));
        operator.invoca(new ComandaPlecareTraseu(3,autobuz1));
        operator.invoca(new ComandaPlecareTraseu(3,autobuz2));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
