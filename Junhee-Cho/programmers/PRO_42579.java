package programmers;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/42579">
 * https://programmers.co.kr/learn/courses/30/lessons/42579 베스트앨범
 * </a>
 */
public class PRO_42579 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}))); //[4, 1, 3, 0]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"A", "A", "B", "A", "B", "B", "A", "A", "A", "A"}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}))); //[0, 1, 2, 4]
        System.out.println(Arrays.toString(new Solution().solution(new String[]{"classic", "pop", "classic", "classic","jazz","pop", "Rock", "jazz"}, new int[]{500, 600, 150, 800, 1100, 2500, 100, 1000}))); //[5, 1, 4, 7, 3, 0, 6]
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Genre> genreList = new ArrayList<>();
        for(int i=0; i<genres.length; i++){
            Genre g = new Genre(genres[i], i, plays[i]);
            if(genreList.contains(g)){
                Genre genre = genreList.get(genreList.indexOf(g));
                genre.addPlay(g.getPlayList().get(0));
            } else {
                genreList.add(g);
            }
        }

        List<Genre> sortedGenre = genreList.stream()
                .sorted(Comparator.comparing(Genre::getTotalPlay).reversed())
                .collect(Collectors.toList());
        sortedGenre.forEach(Genre::sortPlay);

        final int[] result = sortedGenre.stream()
                .map(Genre::getTwoPlayList)
                .flatMap(Collection::stream)
                .map(Play::getNumber)
                .mapToInt(x -> x)
                .toArray();

        return result;
    }

    class Genre{
        private final String genre;
        private final List<Play> playList = new ArrayList<>();

        Genre(String genre, int number, int play){
            this.genre = genre;
            playList.add(new Play(number, play));
        }

        String getGenre() {
            return genre;
        }

        List<Play> getPlayList() {
            return playList;
        }

        List<Play> getTwoPlayList() {
            return playList.stream().limit(2).collect(Collectors.toList());
        }

        int getTotalPlay(){
            return playList.stream().mapToInt(Play::getPlay).sum();
        }

        void addPlay(Play play) {
            playList.add(play);
        }

        void sortPlay(){
            playList.sort(Play::compareTo);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Genre genre1 = (Genre) o;
            return Objects.equals(genre, genre1.genre);
        }

        @Override
        public int hashCode() {
            return Objects.hash(genre);
        }

        @Override
        public String toString() {
            return "Genre{" +
                    "genre='" + genre + '\'' +
                    ", playList=" + playList +
                    '}';
        }
    }

    class Play implements Comparable<Play>{
        private final int number;
        private final int play;

        Play(int number, int play) {
            this.number = number;
            this.play = play;
        }

        int getNumber() {
            return number;
        }

        int getPlay() {
            return play;
        }

        @Override
        public int compareTo(Play play) {
            if(this.play == play.getPlay()) return this.number - play.getNumber();
            return play.getPlay() - this.play;
        }

        @Override
        public String toString() {
            return "Play{" +
                    "number=" + number +
                    ", play=" + play +
                    '}';
        }
    }
}

