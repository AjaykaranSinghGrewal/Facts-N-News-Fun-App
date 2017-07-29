package grewal.example.ajayk.factofun;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-17.
 */

public class FactBookDog {
    private String[] mFacts = {
            "Puppies have 28 teeth and normal adult dogs have 42.",
            "There are more than a dozen separate muscles that control a dog’s ear movements.",
            "A Dog’s sense of smell is 10,000 – 100,000 times more acute as that of humans.",
            "45% of dogs sleep in their owner’s bed",
            "Unlike humans who sweat everywhere, dogs only sweat through the pads of their feet.",
            "Three dogs survived the sinking of the Titanic – two Pomeranians and one Pekingese.",
            "Your dog does have a sense of time — and misses you when you’re gone.",
            "Your dog’s whiskers help him “see” in the dark",
            "On average, a dog’s mouth exerts 320 pounds of pressure.",
            "Your one year-old pup is as physically mature as a 15-year-old human.",
            "Dogs can hear 4 times as far as humans.",
            "Dogs can smell your feelings.",
            "Dog urine can corrode metal.",
            "Dogs can see in colour.",
            "Dogs can smell disease.",
            "Dogs have their own ‘fingerprint’",
            "Dogs dream just like you.",
            "Dogs can fall in love","Apple and pear seeds contain arsenic, which may be deadly to dogs.",
    "Dogs have sweat glands in between their paws","The most dogs ever owned by one person were 5,000 Mastiffs owned by Kublai Khan.",
    "Dachshunds were bred to fight badgers in their dens.","Plato once said that 'a dog has the soul of a philosopher.'","Dalmatians are completely white at birth.",
    "Alexander the Great is said to have founded and named a city Peritas, in memory of his dog.","A puppy is born blind, deaf, and toothless.",
    "The Basenji is the world’s only barkless dog",
    "It costs approximately $10,000 to train a federally certified search and rescue dog.","Eighteen muscles or more can move a dog’s ear.",
    "There are an estimated 400 million dogs in the world.","The U.S. has the highest dog population in the world. France has the second highest.",
    "One female dog and her female children could produce 4,372 puppies in seven years.",
    "Petting dogs is proven to lower blood pressure of dog owners.","The best dog to reportedly attract a date is the Golden Retriever. The worst is the Pit Bull",
    "A group of pugs is called a grumble.","Dogs can be trained to detect seizures!",
    "Dogs release heat by panting instead of sweating like humans.","It is a definite myth that dogs see only black and white.",
    "Puppies have around 28 teeth, while adult dogs have around 42 teeth",
    "A one-year-old dog is physically more mature than a 15-year-old human.","Dog’s nose prints are just as unique and can be used to identify a certain dog.",
    "The largest dog breed is the St. Bernard and the smallest is the Chihuahua.","Dogs and humans are both unique in the sense they are the only ones that have prostates.",
    "The oldest known dog breed is the Saluki, which Egyptians used to help them hunt.","Dogs are all direct descendants of wolves.","Dogs are the best companion and most people’s closest friend"};


    public String getFact() {
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
