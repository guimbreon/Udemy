package codingexercise34;

public class calculator {
    private floor floor;
    private carpet carpet;

    public calculator(floor floor, carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return (floor.getArea()) * (carpet.getCost());
    }
}
