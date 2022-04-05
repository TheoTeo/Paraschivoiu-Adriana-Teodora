package Seminar5.BuilderV2.program;

import Seminar5.BuilderV2.clase.AutobuzBuilder;
import Seminar5.BuilderV2.clase.AutobuzLinie;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
        autobuzBuilder.setAreOprire(false).setNrLinie(4);
        AutobuzLinie autobuzLinie= autobuzBuilder.build();
        System.out.println(autobuzLinie.toString());
    }
}
