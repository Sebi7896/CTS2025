package builder.v4Mall.clase;

import java.util.Arrays;
import java.util.Comparator;

public final class ISU {

    public static void calculGradIncediu(Magazin magazin) {
        //calcul procent din podea
        float procentTipPodea = (float) magazin.getTipPodea().getDuritate() / Arrays.stream(TipPodea.values()).max((o1, o2) -> Integer.compare(o1.getDuritate(), o2.getDuritate())).get().getDuritate() * 100; //dura sa avem 100 nu o sa ia foc
        float mediaProcentelorTipurilorDeMaterialeFolosite = (float) magazin.getSumaTipDecoratiuni() / magazin.getLungimeDecoratiuniPentruISU()  * 100;
        float mediaCelor2 = (procentTipPodea + mediaProcentelorTipurilorDeMaterialeFolosite) / 2;
        System.out.println("Magazinul este sigur " + mediaCelor2 + " %");
    }
}
