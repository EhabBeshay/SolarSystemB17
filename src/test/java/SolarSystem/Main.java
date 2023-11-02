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

        //        PLanet1
        Planet1 plato=new Planet1();
        plato.color="green";
        plato.name="abracadabra";
        plato.temp="10000000k";
        plato.radius="800000km";


    }
}
