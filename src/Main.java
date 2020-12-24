public class Main {

    public static void main(String[] args) {
        CandysBox candysBox = new CandysBox();
        candysBox.addCandy(new Marmalade(1,10,13,"Клубничный мармелад"));
        candysBox.addCandy(new Marmalade(2,10,14,"Мятный мармелад"));
        candysBox.addCandy(new Marmalade(3,10,15,"Cолёный мармелад"));
        candysBox.addCandy(new Marshmallow(4,20,20,"Зефир в шоколаде"));
        candysBox.addCandy(new Marshmallow(5,15,25,"Воздушный зефер"));
        candysBox.addCandy(new Marshmallow(6,30,25,"Зефир в глазури"));
        candysBox.addCandy(new Lollipop(7,20,20,"Петушок на палочке"));
        candysBox.addCandy(new Lollipop(8,25,25,"Шипучий леденец"));
        candysBox.addCandy(new Lollipop(9,15,20,"Кислый леденец"));
        candysBox.addCandy(new ChocolateCandies(11,15,4,"Мишка на севере"));
        candysBox.addCandy(new ChocolateCandies(12,20,6,"Твикс"));
        System.out.println("До оптимизации");
        System.out.println(candysBox.getInformation());
//      candysBox.removeCandy(2);
//      System.out.println(candysBox.getInformation());

        System.out.println("После оптимизации");
        candysBox.optimizedWeight(110);
        //candysBox.optimizedCost(100);
        System.out.println(candysBox.getInformation());
    }
}

