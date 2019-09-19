/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        farm("cow", "moo");
//        farm("duck", "quack"); 
//        farm("cat", "meow");
        // TODO: add another animal to the farm here
//        monkeys(10);
//        hickory_dickory(1);
//        hickory_dickory(2);
        // TODO: make the clock strike three here

        // TODO: call your new methods here ( you must write them first! ) 
    }

    public static void farm(String animal, String sound) {
        System.out.println("Old MacDonald had a farm\n"
                + "e-i-e-i-0\n"
                + "And on that farm he had a " + animal + "\n"
                + "e-i-e-i-o\n"
                + "With a " + sound + " " + sound + " here \n"
                + "And a " + sound + " " + sound + " there \n"
                + "Here a " + sound + " there a " + sound + "\n"
                + "Verywhere a " + sound + " " + sound + "\n"
                + "Old MacDonald had a farm\n"
                + "e-i-e-i-o");

    }

    public static void monkeys(int number) {
        // TODO: write your code here
    }

    public static void hickory_dickory(int time) {
        // TODO: write your code here
    }

    // TODO add your new methods here
}
