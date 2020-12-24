public class Lollipop extends Candys {

     int id;
     int weight;
     int cost;
     String description;

    public Lollipop(int id, int weight, int cost, String description) {
        this.id = id;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }


    public int getCost() {
        return cost;
    }


    public String getDescription() {
        return "Наименование: "+ description+", ID: "+ id+", вес: "+weight+", цена: "+ cost+";";
    }
}
