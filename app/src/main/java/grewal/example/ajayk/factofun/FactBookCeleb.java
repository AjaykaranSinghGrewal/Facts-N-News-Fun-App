package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-26.
 */

public class FactBookCeleb {
    private String[] mFacts = {"Harry Styles and Justin Bieber can juggle.","Lady Gaga wrote Born This Way in 10 minutes.",
            "Nicki Minaj is acrophobic, meaning she is afraid of heights.","As a child, Johnny Depp was allergic to chocolate.","Daniel Craig is the first actor to play James Bond that was born after the series began.",
            "Kim Kardashian posed nude in the December 2007 issue of Playboy magazine.","Robert Downey Jr. claims that Burger King saved his life from his drug addiction.",
            "Liam Payne from One Direction has a fear of spoons","Colin Farrell auditioned in front of Louis Walsh to appear in Boyzone.","James Lipton was a pimp in France.","Sylvester Stallone's first movie was in a porn called Party at Kitty and Stud's.",
            "Jake Gyllenhaal was given his first driving lesson by Paul Newman.","Steve Buscemi spent his early days as a New York City firefighter.",
            "Dolph Lundgren has a master's degree in chemical engineering.","Natalie Portman has been published in TWO scientific journals.",
            "Kesha has an IQ of 140 and scored 1500 on her SATs.","Danica McKellar is a mathematician and has a theorem named after her.","14-year-old Nolan Gould is a member of high IQ society Mensa.",
            "Mindy Kaling was born Vera Mindy Chokalingam.","Vin Diesel's name is an anagram of 'I END LIVES.'","Marilyn Manson's real name is Brian.","Tom Hanks is a third cousin, four generations removed, of Abraham Lincoln.",
            "Oona Chaplin (Game of Thrones) is the granddaughter of Charlie Chaplin!","Woody Harrelson's dad was an assassin.","Geena Davis is an archer who made it to the semifinals in the qualification rounds for the 2000 Olympics.",
            "Warren Beatty and Shirley McLaine are brother and sister.","Walt Disney was afraid of mice.","Jimmy Carter was the first U.S. president to have been born in a hospital.",
            "James Buchanan was the only bachelor president.","George Clooney owns a pet pig named Max.","Vivien Leigh reportedly did not like kissing Clark Gable because she said that he had excessively bad breath.",
            "Walt Disney named Micky Mouse after Mickey Rooney, whose mother he dated for a while.","The Beatles continue to sell more records each year than the Rolling Stones.",
            "Julia Roberts is the highest paid actress in film history.","Actress Lisa Kudrow is a pool shark.",
            "Robert Evans and Jerry Lee Lewis top to the list of male celebrities having had the most wives.","Tom Hanks collects 1940’s typewriters.","Dr. Seuss pronounced his name so it rhymed with 'rejoice'",
            "David Letterman worked at a local grocery store during his teenage years.","Jennifer Lopez started taking singing and dancing lessons at age 5.",
            "Abraham Lincoln went to school for less than a year. He taught himself to read and write.","Jamie Farr was the only member of the cast that was a soldier in the Korean War.",
            "Actress Cameron Diaz’s childhood nickname was Skeletor, as she has always been skinny.","Tom Cruise once enrolled in a seminary to become a priest but dropped out after only one year.","The longest Oscar acceptance speech was made by Greer Garson for 1924's Mrs. Miniver. It took an hour.",
            "Time Magazine's 'Man of the Year' for 1938 was Adolf Hitler.","The Mills Brothers have recorded the most songs of any artist: about 2,250.","Nicole Kidman is scared of butterflies.",
            "At age 16, Cuba Gooding Jr.'s first professional job was as a break-dancer for Lionel Richie.","Ronald Reagan appeared in 60 films from the 1930's to the 1960's.",
            "Before her success as a comedienne, Ellen DeGeneres consider becoming a professional golfer.","Oprah Winfrey became the first female U.S. billionaire in 2003.",
            "‘Lagaan’ had the maximum number of British actors ever to be cast in a single movie in the history of Bollywood.",
            "Saif Ali Khan was the original choice for Shahrukh Khan’s role in ‘Dilwale Dulhania Le Jayenge’.","‘Rockstar’ was shot in reverse, with the climax being shot first.","Raj Kapoor’s ‘Mera Naam Joker’ was the first Hindi movie to have not one but two intervals!",
            "Leonardo DiCaprio was named after Leonardo DaVinci.","Tim Allen was arrested in 1978 for possession of 1.4 POUNDS of cocaine.","When Madonna moved to New York City, she worked at Dunkin’ Donuts.","Sean Connery wore a toupee in every James Bond movie he appeared in.",
            "Elvis was a natural blond. He began dying his hair black in high school.","Sex guru Dr. Ruth is a trained Israeli sniper.","Steve Jobs used to relieve stress by soaking his feet in Apple’s company toilets.",
            "When Jim Carrey was just a teenager, he lived out of a Volkswagen camper.","J.K. Rowling was fired from her job as a secretary for daydreaming too much.",
            "Matthew McConaughey is terrified of revolving doors.","Tyra Banks is terrified of dolphins.","Johnny Depp is terrified of clowns.",
            "Rob Lowe is deaf in his right ear.","Chuck Norris' real first name is Carlos.","Christopher Walken traveled with the circus when he was 15 as a lion tamer.",
            "Nicolas Cage's middle name is Kim.","Ashton Kutcher is also a twin. His brother's name is Michael.","Alanis Morissette has a twin brother named Wade.",
            "Martin Lawrence was born in Germany.","Justin Timberlake is the voice of the 'I'm Lovin' It' campaign.","Bruno Mars' real name is Peter Gene Hernandez.",
            "Miley Cyrus' real name is Destiny Hope.","Ashton Kutcher's real name is Christopher.","Laura Bush also killed someone in a car accident.",
            "Michael J. Fox's middle name is Andrew.","Dr. Ruth is a trained Israeli sniper.","Anne Hathaway wanted to grow up to be a nun.",
            "Adele and Taylor Swift are basically the same age. Adele is 25. Taylor Swift is 24.","R. Kelly is illiterate.","Ryan Gosling was almost in the Backstreet Boys. He was offered a place in the band.",
            "Mark Wahlberg went to jail for 45 days for beating a Vietnamese man.",
            "David Bowie's eye is permanently dilated because of a fight he got in when he was 15.",
            "Martha Stewart used to be a fashion model.","Nicolas Cage once bought a pet octopus because he thought it would help with his acting.",
            "Tom Cruise was the inspiration for Christian Bale's mannerisms in American Psycho.","Leighton Meester was born in prison while her mom was serving time for smuggling drugs.",
            "Jim Carey dropped out of school when he was 16 and worked as janitor.","Tom Cruise has an asymmetrical face.",
            " Nicolas Cage once did mushrooms with his cat.","Jennifer Lawrence used to look exactly like Justin Timberlake did in 1999.",
            "Jackie Chan was in a porn film.","Emma Stone is not a natural redhead. She's actually blonde.","Tom Hanks was once enrolled in seminary school to become a priest.",
            "Ryan Reynolds and Alanis Morissette dated from 2002–2007.","Matthew Perry is missing part of his middle finger because of a door-shutting accident.","Louis CK is a Mexican citizen.",
            "Al Roker and Lenny Kravitz are second cousins.","Jason Sudekis' uncle is Norm from Cheers.","Megan Fox has toe thumbs.",
            "Jaleel White, aka Urkel, did the voice for Sonic the Hedgehog."};

    public String getFact() {
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
