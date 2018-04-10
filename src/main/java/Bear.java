import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> stomach;


    public Bear(String name){
        this.name = name;
        this.stomach = new ArrayList<>();
    }

    public int foodCount(){
        return this.stomach.size();
    }

    public void addFishToStomach(Salmon salmon){
        this.stomach.add(salmon);
    }

    public void eatFishFromRiver(River river){
        addFishToStomach( river.removeFish());

    }

    public void sleep(){
        for (int i = 0; i < foodCount(); i ++){
            this.stomach.remove(i);
        }
    }


















}