package SolarSystem;

public class Main {
    public static void main(String[] args) {

        SolarSystemBasics solarsys=new SolarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

        //******FeatureSun*********

        FeatureSun sun = new FeatureSun();

        sun.name = "Panther";
        sun.color = "Black";
        sun.temp = "-1223124Kelvin";


        //        **planet2**
        Planet2 xaros=new Planet2();
        xaros.name="nehaio";
        xaros.color="blue";
        xaros.size="32432432324324km";

    }
}
