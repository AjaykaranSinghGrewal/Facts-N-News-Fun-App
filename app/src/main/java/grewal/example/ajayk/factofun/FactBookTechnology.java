package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-19.
 */

public class FactBookTechnology {
    private String[] mTechFacts = {
            "On eBay, there is an average of $680 worth of transactions every second.",
            "Ninety-one percent of all adults have their mobile phone within arm’s reach every hour of every day.",
            "Twenty-five percent of Americans use only a mobile device to use the Internet.",
            "Every minute, 100 hours of video are uploaded on YouTube by individual users.",
            "Ninety percent of text messages are read within three minutes of being delivered.",
            "Thirty million individuals watch television programming from their mobile phones.",
            "It has been 40 years since the world’s first mobile phone call successfully took place.",
            "On average, technology users carry 2.9 devices on them at all times.",
            "There are 350 million Snapchat messages sent every day.",
            "There are 500 apps added each day to the Windows Phone Store.","160 billion emails are sent daily, 97% of which are spam.",
    "9 out of every 1,000 computers are infected with spam.","Spammer get 1 response to every 12 million emails they send.",
    "A twillionaire is a twitterer with a million or more followers.",
    "There are some 2 billion TV sets in use.","There are more than 1 billion computers in use.",
    "There are more than 4 billion cell phones in use. About 3 million cell phones are sold every day.",
    "The first known cell phone virus, Cabir.A, appeared in 2004.","Since 2008, video games have outsold movie DVDs.","Amazon sells more e-books than printed books.",
    "Facebook has more than 1.3 billion registered users; about 100 million of those are fake profiles.","Google handles about 1 billion search queries per day, releasing some 200 tons of CO2 per day.",
    "The average US household uses 10.6 megawatt-hours (MWh) electricity per year.","The first public cell phone call was made on April 3, 1973 by Martin Cooper.",
    "The HTC Dream was the world’s first Android phone.",
    "About 20% of the videos on YouTube are music related.",
    "24 hours of video viewing is uploaded every minute on YouTube.",
    "People view 15 billion videos online every month.",
    "On average, US onliners view 100 videos per month each.","Flickr hosts some 5 billion photographs, Facebook hosts more than 15 billion.",
    "Amazon.com did not start as a complete e-commerce business but just as an online bookstore.","The 12 engineers who made IBM PC were named as The Dirty Dozen",
    "The home of Bill Gates was designed with the use of a Macintosh Computer.","Email was invented before the web; which means that it has been around longer.",
    "Ebay has about $680 worth of transactions that take place per second.","There are more than one million domain names that are registered online per month.",
    "Youtue.com was registered February 14th, 2005.","Apple, Microsoft, HP, and Google are all IT applications that started development in a garage.",
    "There are more than one million domain names that are registered online per month.","The Dvorak keyboard is known to be more efficient and 20 times faster than Querty.",
    "Computer programming is an occupation that is growing faster than any other.","The first online advertisement banner was created and used in the year of 1994.",
    "If you are able to find a way to hack into Facebook then they will pay you up to $500.","There are about 1 billion instant messenger accounts that are active around the world today.",
    "70% of virus writers actually work under a contract for an organization.","Laser printers were invented by women.",
    "Up until the 14th of September, 1995, domain registration was free.","The average person receives around 30 emails a day, 3 of these being spam.",
    "Billions of hours are wasted online, spent, waiting for content to download.","Apple says it has sold twice as many iPads as Macs to its education customers.","In the U.S. over 2,300 school districts are using iPads in the classroom.",
    };


    public String getTechFact() {
        String techfact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mTechFacts.length);
        techfact = mTechFacts[randomNumber];

        return techfact;
    }
}

