package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-25.
 */

public class FactBookIndia {
    private String[] mFacts = {"India is the seventh largest country in the world, at 1.27 million square miles.",
            "India is the largest democracy in the world.","The Kumbh Mela is a huge Hindu religious festival that takes place in India every 12 years.",
            "The earliest cotton in the world was spun and woven in India.", "India is the world’s largest producer of dried beans, such as kidney beans and chickpeas.",
            "India leads the world in banana exports; Brazil is second.","With 150,000 post offices, India has the largest postal network in the world.",
            "Alexander the Great was one of the first figures to bring India into contact with the West.",
            "Every major world religion is represented in India.","The Bengal tiger is India’s national animal.","There are fewer than 4,000 wild tigers left.",
            "The British Raj, or British rule, lasted from 1858 to 1947.","British influence is still seen in Indian education system, transportation, and politics.",
            "India has the world’s largest movie industry, based in the city of Mumbai.","Mumbai is India’s largest city, with a population of 15 million.",
            "Indian fig tree is considered a symbol of immortality.", "Introduced by the British, cricket is India’s most popular sport.","Hockey is the national sport, and the Indian field hockey team proudly won Olympic gold in 1928.",
            "Marigold flowers are used as decoration for Hindu marriages.","The official name of India is the Republic of India.","The national fruit of India is the mango.",
            "The national bird is the peacock, which was initially bred for food.","Hindi and English are the official languages of India.",
            "About 1,652 dialects are spoken in the country.","Bathing in the Ganges in particular is thought to take away a person’s sins.",
            "India is the largest milk-producing country in the world.","India has the world’s third largest road network at 1.9 million miles.",
            "India has the world’s second largest rail network.","All of India is under a single time zone.","Raziya Sultana (1205-1240) was the first woman leader of India.",
            "It is traditional to wear white, not black, to a funeral in India.","On India’s Independence Day, August 15, 1947, the country was split into India and Pakistan.",
            "The partition displaced 1.27 million people and resulted in the death of several hundred thousand to a million people.","The Taj Mahal (crown palace) was built by Mughal Emperor Shah Jahan",
            "Dancing is an integral part of worship in the inner shrines of every temple.","Six seasons: summer, autumn, winter, spring, summer monsoon, and winter monsoon.",
            "India is the world’s largest tea producer, and tea (chai) is its most popular beverage.","The first and greatest civilization in ancient India developed around the valley of the Indus River (now Pakistan).",
            "India produces 70% of the world's spices.","Early Indian gods had Greek features and only later did distinct Indian styles emerge.",
            "It is illegal for foreigners to import or export Indian currency.","London has more Indian restaurants than Mumbai or Delhi.",
            "Britain also has the largest Indian restaurant in the world.","India has the lowest meat consumption per person in the world.","About 80% of Indians are Hindu.",
            "Muslims are the largest minority in India with 13% of the country’s population.","India has the third largest population of Muslims in the world, after Indonesia and Pakistan.",
            "The Golden Temple feeds a vegetarian meal to over 100,000 people a day regardless of race, religion and class.","Farmers in India use Coca Cola and Pepsi as an inexpensive form of pesticide.",
            "New Delhi’s air is the most polluted in the world.","Over 14 million adults and children are trapped in modern slavery in India today.",
            "Significantly more people in India have access to a phone than they do to a toilet.","Around a 100 million years ago, India was an island.",
            "India’s name is derived from the “Indus” river.","Indus Valley Civilisation is the world’s oldest civilisation.",
            "India, hence, is the world’s oldest, most advanced and continuous civilisation.","India has the world’s third largest active army, after China and USA.",
            "The gathering is so large that the Kumbh Mela is visible from the space.","Varanasi is the oldest, continuously inhabited city in the world today.",
            "India has more mosques (300,000 mosques) than any other nation in the world.","India has the world’s largest school in terms of students.",
            "Indian Railways employs more than 1.3 million people.","More than 54 crore people voted in the 2014 General Election.","Number of births in India every year is more than the total population of Australia.",
            "India has the largest English speaking population in the world.","Almost, 25% of the total workforce of the world’s population will be from India in the next year or so.",
            "India’s first rocket was brought on cycle and a satellite on bullock cart.","India’s space program is one of the top 5 space programs in the world.",
            "English Actor Sir Ben Kingsley’s is of Indian descent.","Lonar Lake was created by a meteor hitting the Earth and is one of its kind in India.",
            "Chess was invented in India.","Buttons were invented in India. Yes, your shirt’s buttons.","India discovered the number zero and the value of pi.","Until 1986, the only place where diamonds had been officially found was in India.",
            "India is the largest producer of films in the world.","India leads the world with the most murders (32,719) per year, with Russia taking second place.",
            "India’s tech capital, Bangalore, has more Grade-A offices than Singapore.",
            "Two major religions, Buddhism and Jainism, were established in India.","The India-Pakistan World Cup semi-final match in Mohali drew 150 million viewers worldwide.",
            "Around the 17th century, India was one of the richest countries in the world.","Today, India is the world’s third largest economy.","India is one of the only three countries that makes supercomputers.",
            "The world’s largest road network is in India—over 1.9 million miles of roads cover the country.","India has the largest amount of vegetarians in the world.",
            "Pizza Hut had to open their first pure vegetarian restaurant in the country.","Chai is India’s national drink.","India grows 1.2 million tons of mangoes every year, weight equivalent to 80,000 blue whales.",
            "The state of Meghalaya is the wettest inhabited place of earth.","India gave the world Yoga, that has existed for more than 5,000 years.",
            "Martial Arts was first created in India.","The world’s biggest family lives in India. One man, 39 wives and 94 children.","India is the world’s largest importer of arms.",
            "India has never invaded or attacked a country.","Half of the world's whiskey is consumed in India.","More people die because of selfies in India than anywhere in the world.",
            "The village of Kodhini in Kerala was home to 220 sets of twins in 2009.","And ISRO's Mars Orbiter Mission cost less than the movie Gravity."    };

    public String getFact() {
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
