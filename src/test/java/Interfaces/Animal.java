package Interfaces;

public class Animal implements Info {
    @Override
    public void showInfo() {
        System.out.println("Id is "+this.id);
    }
    public int id;
    public Animal(int id){
    this.id = id;
}
    public void sleep (){
        System.out.println("Im sleeping");
    }


}
