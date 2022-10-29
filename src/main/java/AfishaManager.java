
public class AfishaManager {

    private String[] movies = new String[0];
    private int limit;



   // конструкторы
    public AfishaManager(){
        this.limit = 1;
    }
    public AfishaManager(int limit) {
        this.limit = limit;
    }




    // метод добавления фильмов
    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    // метод вывод всех ильмов в порядке добавления
    public String[] findAll() {
        return movies;


    }


    // метод вывод максимума ильмов в обратном порядке добавления
    public String[] findLast() {
        int resultLength;
        if (movies.length < limit){
            resultLength = movies.length;
        }else {
            resultLength = limit;
        }


        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1-i];
        }
        return tmp;
    }

}



