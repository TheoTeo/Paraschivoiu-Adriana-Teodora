package Seminar5.Builder.program;

import Seminar5.Builder.clase.AutobuzBuilder;
import Seminar5.Builder.clase.AutobuzLinie;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder=new AutobuzBuilder().setNumeSofer("Ciprian").setAreOprire(false);

        AutobuzLinie autobuzLinie=autobuzBuilder.build();
      //  autobuzLinie.setNumeSofer("CTS");---pt ca am lasat default
        System.out.println(autobuzLinie.toString());
    }

}
