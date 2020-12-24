public class Marmalade extends Candys {

    int id;
    int weight;
    int cost;
    String description;

    public Marmalade(int id, int weight, int cost, String description) {
        this.id = id;
        this.weight = weight;
        this.cost = cost;
        this.description = description;
    }

    public String getDescription() {
        return "Наименование: " + description + ", ID: " + id + ", вес: " + weight + ", цена: " + cost + ";";
    }

        @Override
        public int getWeight() {
            return weight;
        }

        @Override
        public int getCost() {
            return cost;
        }
    }
