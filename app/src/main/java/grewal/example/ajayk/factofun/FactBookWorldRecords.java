package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-25.
 */

public class FactBookWorldRecords {
    private String[] mFacts = {
      "It is impossible to lick your elbow","A crocodile can't stick it's tongue out.","A shrimp's heart is in it's head.",
            "People say 'Bless you' when you sneeze because your heart stops for a mili-second.","It is physically impossible for pigs to look up into the sky.",
            "More than 50% of the people in the world have never made or received a telephone call.","Rats and horses can't vomit.",
            "If you sneeze too hard, you can fracture a rib.","If you try to suppress a sneeze, you can rupture a blood vessel in your head or neck and die.",
            "If you keep your eyes open by force when you sneeze, you might pop an eyeball out.","Rats multiply so quickly that in 18 months, two rats could have over a million descendants.",
            "In every episode of Seinfeld there is a Superman somewhere.","Wearing headphones for just an hour will increase the bacteria in your ear by 700 times.",
            "The cigarette lighter was invented before the match.","Thirty-five percent of the people who use personal ads for dating are already married.",
            "A duck's quack doesn't echo, and no one knows why.","In the course of an average lifetime you will, while sleeping, eat 70 assorted insects and 10 spiders.",
            "23% of all photocopier faults worldwide are caused by people sitting on them and photocopying their butts.",
            "Most lipstick contains fish scales.","Like fingerprints, everyone's tongue print is different.","Over 75% of people who read this will try to lick their elbow.",
            "A crocodile can't move its tongue and cannot chew. Its digestive juices are so strong that it can digest a steel nail.","Ethernet is a registered trademark of Xerox, Unix is a registered trademark of AT&T.",
            "Uranus' orbital axis is tilted at 90 degrees.","Outside the USA, Ireland is the largest software producing country in the world.",
            "Figlet, an ASCII font converter program, stands for Frank, Ian and Glenn's LETters.","Every human spent about half an hour as a single cell.","Every year about 98% of atoms in your body are replaced.",
            "Hot water is heavier than cold.","If you went out into space, you would explode before you suffocated because there's no air pressure.",
            "The radioactive substance, Americanium - 241 is used in many smoke detectors.","Sound travels 15 times faster through steel than through the air.",
            "On average, half of all false teeth have some form of radioactivity.","Only one satellite has been ever been destroyed by a meteor: the European Space Agency's Olympus in 1993.",
            "A ball of glass will bounce higher than a ball of rubber.",
            "At a jet plane's speed, the length of the plane becomes one atom shorter than its original length.","Ostriches are often not taken seriously. They can run faster than horses, and the males can roar like lions.",
            "Seals used for their fur get extremely sick when taken aboard ships.","Guinea pigs and rabbits can't sweat.","Sloths take two weeks to digest their food.",
            "The porpoise is second to man as the most intelligent animal on the planet.","Young beavers stay with their parents for the first two years of their lives before going out on their own.",
            "Deer can't eat hay.","Skunks can accurately spray their smelly fluid as far as ten feet.","On average, dogs have better eyesight than humans, although not as colorful.",
            "The duckbill platypus can store as many as six hundred worms in the pouches of its cheeks.","The lifespan of a squirrel is about nine years.","North American oysters do not make pearls of any value.",
            "Human birth control pills work on gorillas.","Gorillas sleep as much as fourteen hours per day.","A biological reserve has been made for golden toads because they are so rare.",
            "There are more than fifty different kinds of kangaroos.","The female lion does ninety percent of the hunting.","A group of twelve or more cows is called a flink.",
            "The 57 on Heinz ketchup bottle represents the varieties of pickle the company once had.","The Declaration of Independence was written on hemp paper.",
            "Susan Lucci is the daughter of Phyllis Diller.","315 entries in Webster's 1996 Dictionary were misspelled.","On average, 12 newborns will be given to the wrong parents daily.",
            "Warren Beatty and Shirley MacLaine are brother and sister.","Donald Duck comics were banned from Finland because he doesn't wear any pants.",
            "Ketchup was sold in the 1830s as medicine.","Leonardo da Vinci could write with one hand and draw with the other at the same time.",
            "There are no clocks in Las Vegas gambling casinos.","There are no words in the dictionary that rhyme with: orange, purple, and silver!",
            "A tiny amount of liquor on a scorpion will make it instantly go mad and sting itself to death.","Chewing gum while peeling onions will keep you from crying!",
            "The glue on Israeli postage stamps is certified kosher.","Beetles taste like apples, wasps like pine nuts, and worms like fried bacon.",
            "Of all the words in the English language, the word ’set’ has the most definitions!","'Rhythm' is the longest English word without a vowel.",
            "Human thigh bones are stronger than concrete.","You can’t kill yourself by holding your breath.","There is a city called Rome on every continent.",
            "It’s against the law to have a pet dog in Iceland.","Your heart beats over 100,000 times a day.","Your ribs move about 5 million times a year, everytime you breathe!",
            "The elephant is the only mammal that can’t jump!","One quarter of the bones in your body, are in your feet!","Fingernails grow nearly 4 times faster than toenails!","Most dust particles in your house are made from dead skin!",
            "Women blink nearly twice as much as men.","Adolf Hitler was a vegetarian, and had only ONE testicle.",
            "Coca-Cola would be green if colouring weren’t added to it.","On average a hedgehog’s heart beats 300 times a minute.","More people are killed each year from bees than from snakes.",
            "More people are allergic to cow’s milk than any other food.","Camels have three eyelids to protect themselves from blowing sand.",
            "Earth is the only planet not named after a god.","It’s against the law to burp, or sneeze in a church in Nebraska, USA.","Dolphins sleep with one eye open!",
            "Some worms will eat themselves if they can’t find any food!","The worlds oldest piece of chewing gum is 9000 years old!","The longest recorded flight of a chicken is 13 seconds.","Slugs have 4 noses.",
            "Owls are the only birds who can see the colour blue.","A man named Charles Osborne had the hiccups for 69 years!","A giraffe can clean its ears with its 21-inch tongue!",
            "An ostrich’s eye is bigger than its brain","The average person laughs 10 times a day!","A pig's orgasm lasts 30 minutes.","A cockroach will live for weeks without its head before it starves to death",
            "Banging your head against a wall uses 150 calories a hour.","The catfish has over 27,000 taste buds.","Some lions mate over 50 times a day.","Butterflies taste with their feet.",
            "The strongest muscle in the body is the tongue.","A cat's urine glows under a black light.","Starfish have no brains.","Polar bears are left-handed.",
            "Humans and dolphins are the only species that have sex for pleasure","In France, it is legal to marry a dead person."  };

    public String getFact() {
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
