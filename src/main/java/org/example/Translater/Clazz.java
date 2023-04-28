package org.example.Translater;

public class Clazz {
    public static void main(String[] args) {

        System.out.println("Azerbaijan to Eng, Rus and Tr languages.");

        FuncEng langE = greet -> "Hi";
        String toEng = langE.doEng("Salam");
        System.out.println(toEng);

        FuncAz langR = greet -> "Privet";
        String doRus = langR.doAz("Salam");
        System.out.println(doRus);

        FuncTr langT = greet -> "Merhaba";
        String toTr = langT.doTr("Salam");
        System.out.println(toTr);
    }
}

interface Languages{
}

@FunctionalInterface
interface FuncEng{
    String doEng(String s);
}
@FunctionalInterface
interface FuncAz{
    String doAz(String s);
}
@FunctionalInterface
interface FuncTr{
    String doTr(String s);
}
