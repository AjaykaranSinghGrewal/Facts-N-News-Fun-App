package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-19.
 */

public class FactBookCat {
    private String[] mCatFacts = {
            "A group of cats is called a clowder.",
            "The technical term for a cat’s hairball is a bezoar.",
            "Cats make about 100 different sounds. Dogs make only about 10.",
            "Every year, nearly four million cats are eaten in Asia.",
            "Approximately 24 cat skins can make a coat.",
            "Approximately 40,000 people are bitten by cats in the U.S. annually.",
            "A cat can travel at a top speed of approximately 31 mph (49 km) over a short distance.",
            "Many Egyptians worshipped the goddess Bast, who had a woman’s body and a cat’s head.",
            "The most popular pedigreed cat is the Persian cat, followed by the Main Coon cat and the Siamese cat.",
            "A cat can jump up to five times its own height in a single bound",
            "A cat usually has about 12 whiskers on each side of its face.",
            "Most cats sleep around 16 hours a day",
            "A cat’s jaw can’t move sideways, so a cat can’t chew large chunks of food.",
            "A cat’s back is extremely flexible because it has up to 53 loosely fitting vertebrae.",
            "All cats have claws, and all except the cheetah sheath them when at rest",
            "A cat lover is called an Ailurophilia (Greek: cat+lover).",
            "One reason that kittens sleep so much is because a growth hormone is released only during sleep.",
            "Cats have about 130,000 hairs per square inch (20,155 hairs per square centimeter).",
            "Approximately 1/3 of cat owners think their pets are able to read their minds.",
            "The tiniest cat on record is Mr. Pebbles, a 2-year-old cat that weighed 3lbs and was 6.1inches high.",
            "In the 1750s, Europeans introduced cats into the Americas to control pests.",
            "The first cat show was organized in 1871 in London. Cat shows later became a worldwide craze.",
            "A cat’s nose pad is ridged with a unique pattern, just like the fingerprint of a human.",
            "If they have ample water, cats can tolerate temperatures up to 133 °F.",
    "A group of cats is called a clowder.",
    "Cats sleep 70% of their lives.",
    "A cat has been mayor of Talkeetna, Alaska, for 15 years. His name is Stubbs.",
    "Cats have over 20 muscles that control their ears.",
    "Cats can't taste sweetness.","Owning a cat can reduce the risk of stroke and heart attack by a third.","Wikipedia has a recording of a cat meowing because why not?",
    "The world's largest cat measured 48.5 inches long.",
    "Adult cats only meow to communicate with humans.",
    "The world's richest cat is worth $13 million after his human passed away and left her fortune to him.",
    "Your cat recognizes your voice but just acts too cool to care (probably because they are).",
    "The oldest cat video on YouTube dates back to 1894","Female cats are typically right-pawed while male cats are typically left-pawed.",
    "Cats make more than 100 different sounds whereas dogs make around 10.",
    " A cat's brain is 90% similar to a human's — more similar than to a dog's.",
    "Cats and humans have nearly identical sections of the brain that control emotion.","Cats have 1,000 times more data storage than an iPad.",
    "A cat has five toes on his front paws, and four on the back, unless he's a polydactyl.",
    "There are 45 Hemingway cats living at the author's former home in Key West, Fla.",
    "Abraham Lincoln kept four cats in the White House.",
    "Isaac Newton is credited with inventing the cat door.","A cat can jump up to six times its length.","A house cat is faster than Usain Bolt.",
    "When cats leave their poop uncovered, it is a sign of aggression to let you know they don't fear you.", "Cats use their whiskers to detect if they can fit through a space.",
    "Cats only sweat through their foot pads.","The first cat in space was French. She was named Felicette. She survived the trip.",
    "Cats can move their ears 180 degrees.", "They can also move their ears separately.","A cat has detected his human's breast cancer.",
    "A cat's nose is ridged with a unique pattern, just like a human fingerprint.",
    "A cat rubs against people to mark its territory.",
    "Cats lick themselves to get your scent off.",
    "Cats lick themselves to get your scent off.",
    "Cats were mythic symbols of divinity in ancient Egypt.", "Black cats are bad luck in the United States, but they are good luck in the United Kingdom and Australia."
    ,"The Egyptian Mau is the oldest breed of cat.","This breed is also the fastest pedigreed cat.","The Egyptian word for cat is, in fact, mau","Only 11.5% of people consider themselves cat people.",
    "Cat people are 11% more likely to be introverted.", "Cat people are more open to new experiences than typical dog people.",
    "Cat owners who are male tend to be luckier in love, as they are perceived as more sensitive.",
    "Cat owners are 17% more likely to have a graduate degree.",
    "Cat people are 25% likely to pick George as their favorite Beatle.", "A cat's carbon footprint is similar to that of a VW Bug, whereas a dog's is more like a Hummer.",
    "The largest litter of kittens produced 19 kittens.", "When your cat brings home a dead mouse or bird, it may do so to show you that you suck at hunting.",
    "Only 24% of cats who enter animal shelters are adopted.","Cats are really cool and soft!.", "Eighty-eight percent of cats in the U.S. are spayed or neutered."};


    public String getCatFact() {
        String catfact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mCatFacts.length);
        catfact = mCatFacts[randomNumber];

        return catfact;
    }
}
