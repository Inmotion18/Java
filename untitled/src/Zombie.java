public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }
    // Overload this method to make SCREAMS
    @Override
    public void growl(){
        System.out.print("Raaaauuughhhh");
        super.growl();
    }
    public void growl(boolean loud){
        if(!loud){
            growl();
        }else {
            System.out.println(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }

}