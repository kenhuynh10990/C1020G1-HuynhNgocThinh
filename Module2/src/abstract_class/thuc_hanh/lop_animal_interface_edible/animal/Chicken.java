package abstract_class.thuc_hanh.lop_animal_interface_edible.animal;

import abstract_class.thuc_hanh.lop_animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: lolololol!!!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
