package com.example.firstapplication.Model;

import java.util.ArrayList;

public class AnimeData {
    public static String [][] data = new String[][]{
            {"Sokugeki No Soma", "Ever since he was a child, fifteen-year-old Souma Yukihira has helped his father by working as the sous chef in the restaurant his father runs and owns. Throughout the years, Souma developed a passion for entertaining his customers with his creative, skilled, and daring culinary creations. His dream is to someday own his family's restaurant as its head chef.\n" +
                    "\n" +
                    "Yet when his father suddenly decides to close the restaurant to test his cooking abilities in restaurants around the world, he sends Souma to Tootsuki Culinary Academy, an elite cooking school where only 10 percent of the students graduate. The institution is famous for its \"Shokugeki\" or \"food wars,\" where students face off in intense, high-stakes cooking showdowns.\n" +
                    "\n" +
                    "As Souma and his new schoolmates struggle to survive the extreme lifestyle of Tootsuki, more and greater challenges await him, putting his years of learning under his father to the test.","https://data.en.businesstimes.cn/data/images/full/85735/food-wars-season-4-new-update-release-date-points-summer-2019-trailer-suggests-promotional-arc.jpg"},
            {"Rakudai kishi no cavalry", "There exist few humans in this world with the ability to manipulate their souls to form powerful weapons. Dubbed \"Blazers,\" these people study and train at the prestigious Hagun Academy to become Mage-Knights; among the students is so-called failure Ikki Kurogane, the sole F-rated Blazer.","https://cdn.myanimelist.net/images/anime/9/76493.jpg"},
            {"Kimetsu no Yaiba","Since ancient times, rumors have abounded of man-eating demons lurking in the woods. Because of this, the local townsfolk never venture outside at night.","https://cdn.myanimelist.net/images/anime/1286/99889.jpg"},
            {"One Punch Man 2nd Season","The second season of One Punch Man.","https://cdn.myanimelist.net/images/anime/1805/99571.jpg"},
            {"Fruits Basket (2019)","Tooru Honda has always been fascinated by the story of the Chinese Zodiac that her beloved mother told her as a child. However, a sudden family tragedy changes her life, and subsequent circumstances leave her all alone.","https://cdn.myanimelist.net/images/anime/1447/99827.jpg"},
            {"Sewayaki Kitsune no Senko-san","The everyday life of Nakano, a salaryman working for an exploitative company, is suddenly intruded upon by the fox, Senko-san (800-year-old little girl).","https://cdn.myanimelist.net/images/anime/1814/99677.jpg"},
            {"Kenja no Mago","In the kingdom of Earlshide, Merlin Walford was once regarded as a national hero, hailed for both his power and achievements. Preferring a quiet life however, he secludes himself deep in the rural woods, dedicating his time to raising an orphan that he saved.","https://cdn.myanimelist.net/images/anime/1261/100452.jpg"},
            {"Shingeki no Kyojin Season 3 Part 2","The second part of the third season of Shingeki no Kyojin.","https://cdn.myanimelist.net/images/anime/1517/100633.jpg"},
            {"Gunjou no Magmell","One day in the middle of the pacific ocean a miracle occurred, a new continent appeared out of nowhere! The new continent was the home for new and mysterious plants, creatures and minerals!","https://cdn.myanimelist.net/images/anime/1063/98597.jpg"},
            {"Bokutachi wa Benkyou ga Dekinai","His late father always said that a useless man should strive to be useful, so to that end, third-year high school student Nariyuki Yuiga dedicated himself to becoming a high-achieving student in his school, despite his history of poor grades.","https://cdn.myanimelist.net/images/anime/1602/100510.jpg"}
    };

    //make Array
    public static ArrayList<Anime> animeListData(){
        Anime anime = null;
        ArrayList<Anime> listDataAnime = new ArrayList<>();

        for (String[] aData : data){
            anime   = new Anime();
            anime.setName(aData[0]);
            anime.setDescription(aData[1]);
            anime.setPhoto(aData[2]);

            listDataAnime.add(anime);
        }
    return listDataAnime;
    }
}
