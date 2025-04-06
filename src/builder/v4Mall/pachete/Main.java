package builder.v4Mall.pachete;

import builder.v1pacheteTuristice.clase.BuilderPachet;
import builder.v4Mall.clase.*;

public class Main {
    public static void main(String[] args) {
        BuilderMagazin builderMagazin = new BuilderMagazin("magazin 1",2,200);
        Magazin magazin = builderMagazin.build();
        System.out.println(magazin);
//        Magazin magazin1 = builderMagazin.adaugaTipPodea(TipPodea.MOALE).adaugaDecoratiune("nush", TipMaterialDecoratiune.STICLA).build();
//        System.out.println(magazin1);

//        BuilderMagazin builderMagazin1 = new BuilderMagazin("magazin 2",300,1);
//        Magazin magazin2 = builderMagazin1.build();
//        System.out.println(magazin2);
        BuilderMagazin builderMagazin1 = new BuilderMagazin("magazin durabil", 200,2);
        Magazin magazin1Durabil = builderMagazin1.adaugaTipPodea(TipPodea.DURA).build();
        Magazin magazin2DurabilAsaSiAsa = builderMagazin1.adaugaTipPodea(TipPodea.DURA).adaugaDecoratiune("dsad",TipMaterialDecoratiune.LEMN).adaugaDecoratiune("2311",TipMaterialDecoratiune.LEMN).adaugaDecoratiune("21313",TipMaterialDecoratiune.METAL).build();
        ISU.calculGradIncediu(magazin2DurabilAsaSiAsa);

    }
}
