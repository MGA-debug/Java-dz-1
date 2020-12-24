import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandysBox implements BoxInterface {
    private List<Candys> candysBox;


    public CandysBox() {
        candysBox = new ArrayList<>();
    }

    @Override
    public void addCandy(Candys c) {
        candysBox.add(c);
    }

    @Override
    public void removeCandy(int index) {
        candysBox.remove(index);
    }

    @Override
    public int getWeight() {
        int totalWeight = 0;
        for (Candys c : candysBox)
            totalWeight += c.getWeight();

        return totalWeight;
    }

    @Override
    public int getCost() {
        int totalCost = 0;
        for (Candys c : candysBox)
            totalCost += c.getCost();

        return totalCost;
    }


    @Override
    public String getInformation() {
        String s = "Внутри подарка: ";
        for (Candys c : candysBox)
            s += "\n" + c.getDescription();
        return "Стоимость подарка: "+getCost() + "\n"+"Вес подарка: " + getWeight() + "\n" + s;
    }


    public void optimizedCost(int cost) {          //методы для оптимизации
        candysBox.sort((o1, o2) -> {
            if (o1.getCost() > o2.getCost())
                return 1;
            else if (o1.getCost() < o2.getCost())
                return -1;
            else
                return 0;
        });
        while (getCost() > cost) {
            candysBox.remove(0);
        }
    }


    public void optimizedWeight (int weight){
            candysBox.sort((o1, o2) -> {
                if (o1.getWeight() > o2.getWeight())
                    return 1;
                else if (o1.getWeight() < o2.getWeight())
                    return -1;
                else return 0;
            });
            while (getWeight() > weight) {
                candysBox.remove(0);
            }
        }
    }

