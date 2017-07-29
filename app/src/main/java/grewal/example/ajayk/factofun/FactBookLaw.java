package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-25.
 */

public class FactBookLaw {
    private String[] mFacts = {"In seven U.S. states, according to their constitutions, atheists are barred from holding public office.",
            "Interracial marriage was still illegal in Alabama in 2000.","US authorities have had the legal right to access any 180-day old email, without a warrant.",
            "In Mobile, Alabama, it is against the law to throw confetti or spray silly string.","In Saudi Arabia, it is illegal for any woman to drive a car.",
            "In Dubai, extramarital sex is against the law and could result in jail sentences.","In Saudi Arabia, there is no minimum age for marriage.",
            "In 29 states in the US it is legal to fire someone for being gay.","The only two states where divorce is illegal are the Philippines and The Vatican.",
            "In Thailand it is illegal to step on money.","In Iowa, it is illegal for a man with a mustache to kiss a woman in public.",
            "In Massachusetts it is deemed illegal for a woman to be on top during sex.","In Virginia, it is illegal for a man to kick a woman out of bed.",
            "In Britain it is illegal to handle a salmon in suspicious circumstances.","In Vermont, a wife needs the husband’s permission to wear false teeth.",
            "In North Carolina couples must have sex in the missionary position and with the curtains pulled.",
            "In Britain, it is illegal to import potatoes into England or Wales.",
            "In Oregon, talking dirty while having sex is illegal.","In Britain you are not allowed to let your pet mate with any pet form the royal house.",
            "In Utah, a husband is responsible for his wife’s actions.","In Kentucky, a woman cannot remarry the same man more than three times.",
            "In parts of India, a man who is in debt can offer up his wife until the debt is paid.","In France, it is stated as illegal to marry a dead person.",
            "In Britain, it is illegal to carry a plank along the pavement.","In Britain it is illegal to operate a cow while intoxicated.",
            "In New York City it is illegal to honk your horn. If you do, you’re at risk of paying $350 fine.","In Florida, it’s illegal to fart in a public place after 6pm on a Thursday.",
            "By law, any whale or great Sturgeon caught in the UK is the property of the Queen.","In Samoa it is illegal to forget your wife’s birthday.",
            "In Britain, oddly enough it is illegal to be drunk in the pub.","In Missouri it is illegal to drive with an uncaged bear",
            "In Turin, Italy, dog owners must take their dogs on a walk at least three times a day.","In Honolulu, Hawaii it is illegal to sing loudly after sunset.",
            "In Victoria, Australia, it is illegal to change a light bulb unless you’re a licensed electrician.","Bangladeshi children of 15 and older can be sent to jail for cheating on their final exams.",
            "In Australia, men are free to cross-dress, just as long as their dresses are not strapless.",
            "In Florida it is illegal for a divorced or a widowed woman to skydive on a Sunday afternoon.","In Switzerland, it is illegal to flush a toilet after 10pm. This one confounds me.",
            " In Canada, any comic book that portrays illegal activity is banned.","In China, it is a law that a person must be intelligent to go to college.",
            "In Tennessee it is legal to carry a loaded firearm into a bar. Seems safe.","In France, it is illegal to name a pig Napoleon. Apparently this is a slight to the great French general and emperor.",
            "In Russia, Vladimir Putin just recently made it illegal to tell kids that gay people exist.","In Colorado it is illegal to collect rainwater. Apparently farmers and landowners are being punished for this.",
            "In Coulaines, spitting was banned in 2009 to stop the spreading of swine flu.","In Milan, it is a legal requirement to smile at all the times, except during funerals or hospital visits. If you don’t, you have to pay a fine.",
            "A popular law passed in England prohibits people to die in the House of Parliament. It is completely true and confirmed.","Eboli is a small town in Italy and kissing in a moving vehicle is banned here.",
            "In Oklahoma, it is against the law to have a sleeping donkey in your bathtub after 7 pm.","Driving a dirty car is against the law in the Russian city of Chelyabinsk.",
            "It is against the law not to walk your dog at least three times a day in Tornio, Italy.","In Canada, by law, one out of every five songs on the radio must be sung by a Canadian.","Visitors of North Korea are not allowed to use North Korean currency.",
            "A law passed in 2009 in Japan states that it is illegal to be fat.","In Venice, it is illegal to feed the pigeons.","In Scotland, if someone knocks on your door and requires the use of your toilet, you must let them.",
            "In Singapore moving naked in the house can get you arrested.","Bear wrestling is illegal in Alabama.",
            "In Oklahoma, you can be arrested for making ugly faces at a dog.","In Devon, Texas, it is against the law to make furniture while you are nude.",
            "In Thailand, you can’t leave your house if you are not wearing underwear.","In Samoa, it is illegal to forget your wife’s birthday.",
            "In Texas, it’s illegal to threaten somebody with an UNLOADED gun.","In Michigan, it is illegal to chain an alligator to a fire hydrant.","In Illinois, giving a lighted cigar to a pet is illegal.," +
            "In Kentucky, carrying ice cream cones in your pocket is illegal.","In Illinois, giving a lighted cigar to a pet is illegal.","In Oxford, Ohio, a woman undressing in front of a picture of a man is breaking the law.",
            "In Baltimore, Maryland, taking a lion to the cinema is illegal.","In France, it’s illegal to name a pig Napoleon.",
            "In Turkey, it is illegal for a man above 80 years to become a pilot.","In Ohio, it is against state law to get a fish drunk.","In British Columbia, it is illegal to kill a Sasquatch or Bigfoot if one is ever found.",
            "You cannot fish while sitting on a giraffe’s neck in Chicago.","In Champaign, you can’t pee in your neighbor’s mouth.","In Bermuda, up until 1948, all private cars were banned.",
            "At one time it was against the law to slam car doors in Switzerland.","In Victoria, Australia, only a licensed electrician is allowed to change a light bulb.",
            "In Victoria Australia it is forbidden to wear pink hot pants after mid-day on a Sunday.","In Portugal, it’s against the law to pee in the ocean.",
            "Chewing gum is illegal in Singapore.","In Paraguay, duelling is legal just as long as both parties are registered blood donors.","Donald Duck comics were once banned in Finland because he never wore pants.",
            "In Maryland, it is illegal for radio stations to play Randy Newman's song ‘Short people’.","In Washington, it is an offence to pretend that you have rich parents.",
            "In Kentucky, it is illegal to carry and ice cream cone in your pocket.","In Massachusetts, it is illegal for mourners to eat no more than three sandwiches at a wake.",
            "In California, women cannot drive in a house coat.","In California, police can arrest you if you shoot any animal from a moving vehicle.",
            "In California it is illegal for a vehicle without a driver to exceed 60 miles per hour.","In Tennessee, you are breaking the law if you drive while sleeping.",
            "In Danville, Pennsylvania, all fire hydrants must be checked one hour before all fires.","In New York, the penalty for jumping off a building is: Death.",
            "In Florida, it is illegal to fart in a public place after 6pm on Thursdays.","In Indiana, it’s against the law to dress Barbie in Ken’s clothes.",
            "In Texas, if you are going to commit a crime, you legally have to give 24 hours notice to the police.","In Chicago, it is illegal for anyone to eat in a place that is on fire.",
            "In Pennsylvania, it is illegal to sleep on top of a refrigerator outdoors.","In Kentucky, it is illegal to carry a concealed weapon more than six-feet long.","In New York City it is illegal to honk your horn. If you do, you’re at risk of paying $350 fine.",
            "In Miami, it is illegal to skateboard in a police station.","In Florida, unmarried women who parachute on Sundays can be jailed.","It England, it is illegal for a cab in the city of London to carry rabid dogs or corpses.",
            "In Colorado it is illegal to collect rainwater. Farmers and landowners are being punished for this.","It England, it is illegal to die in the Houses of Parliament.",
            "In ancient Sparta, men were required by law to eat at least two pounds of meat every day. This was supposed to make them brave.",
            "In Seville, Spain, in 1983, an Alsatian dog was arrested for snatching handbags from shoppers.","In Ohio, it is against state law to get a fish drunk.",
            "In Baltimore, Maryland, USA, it is an offence to take a lion into a cinema.","In Miami, Florida, USA, it is illegal for anyone to imitate an animal.","" +
            "In Australia, it’s illegal to name any animal you plan to eat.","In Iceland it was once against the law to own a pet dog.","In Texas, it is illegal for one to shoot a buffalo from the second story of a hotel.",
            "In Boulder, Colorado, it is illegal to kill a bird within the city limit.","In Missouri it is illegal to drive with an un-caged bear","You Can't Ride a Cow in Scotland If You're Drunk.","" +
            "Hitting on a Bartender in Nebraska Is a Crime.","In El Salvador, You Can Be Shot for Drunk Driving.","In England, It's Illegal to Be Drunk in a Pub."  };

    public String getFact() {
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
