package abstract_class.thuc_hanh.lop_animal_interface_edible;

import abstract_class.thuc_hanh.lop_animal_interface_edible.animal.Animal;
import abstract_class.thuc_hanh.lop_animal_interface_edible.animal.Chicken;
import abstract_class.thuc_hanh.lop_animal_interface_edible.animal.Tiger;
import abstract_class.thuc_hanh.lop_animal_interface_edible.fruit.Apple;
import abstract_class.thuc_hanh.lop_animal_interface_edible.fruit.Fruit;
import abstract_class.thuc_hanh.lop_animal_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Orange();
        fruits[1]=new Apple();
        for( Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }

    }
}
