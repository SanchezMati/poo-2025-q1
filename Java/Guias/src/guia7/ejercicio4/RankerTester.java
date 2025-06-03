package guia7.ejercicio4;

public class RankerTester {
    public static void main(String[] args) {
        Ranker ranker = new Ranker();

        Book hp7 = new Book("Harry Potter and the Deadly Hallows", "JK Rowling");
        Book t2t = new Book("The Two Towers", "JRR Tolkien");
        Book theHobbit = new Book("The Hobbit", "JRR Tolkien");
        Book studyInScarlet = new Book("A Study in Scarlet", "Arthur Conan Doyle");
        Book hamlet = new Book("Hamlet", "William Shakespeare");
        Book prejudice = new Book("Pride and Prejudice", "Jane Austen");
        Book eragon = new Book("Eragon", "Christopher Paolini");

        ranker.add(Genre.FANTASY, hp7).add(Genre.FANTASY, theHobbit)
                .add(Genre.FANTASY, t2t).add(Genre.FICTION, studyInScarlet)
                .add(Genre.DRAMA, hamlet).add(Genre.DRAMA, prejudice);

        ranker.rateUp(hp7);
        ranker.rateUp(hp7);
        ranker.rateUp(hp7);
        ranker.rateUp(theHobbit);
        ranker.rateUp(theHobbit);
        ranker.rateUp(hamlet);
        ranker.rateUp(new Book("Eragon", "Christopher Paolini"));
        ranker.rateUp(eragon);

        ranker.printRanking(Genre.FANTASY);
        System.out.println("---------------------------------");
        ranker.printRanking(Genre.DRAMA);
        System.out.println("---------------------------------");
        ranker.printRanking(Genre.CHILDREN);
        System.out.println("---------------------------------");
        ranker.printRanking();

            //Ranking of Fantasy
            //Harry Potter and the Deadly Hallows : 3
            //The Hobbit : 2
            //The Two Towers : 0
            //        ---------------------------------
            //Ranking of Drama
            //Hamlet : 1
            //Pride and Prejudice : 0
            //        ---------------------------------
            //Ranking of Children
            //---------------------------------
            //General Ranking
            //Harry Potter and the Deadly Hallows : 3
            //Eragon : 2
            //The Hobbit : 2
            //Hamlet : 1
            //A Study in Scarlet : 0
            //Pride and Prejudice : 0
            //The Two Towers : 0
    }
}



