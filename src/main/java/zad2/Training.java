package zad2;

public class Training
{
    private String trainingName;        // nazwa kursu
    private String trainingCategory;    // kategoria kursu
    private int  numberOfParticipants;  // liczba uczestników
    private String trener;              // trener
    private String term;                // termin

    public Training() { }

    public Training(String trainingName, String trainingCategory, int numberOfParticipants, String term)
    {
        this.trainingName = trainingName;
        this.trainingCategory = trainingCategory;
        this.numberOfParticipants = numberOfParticipants;
        this.term = term;
    }

    public Training(String trainingName, String trainingCategory, int numberOfParticipants, String trener, String term)
    {
        this.trainingName = trainingName;
        this.trainingCategory = trainingCategory;
        this.numberOfParticipants = numberOfParticipants;
        this.trener = trener;
        this.term = term;
    }

    public String getTrainingName()
    {
        return trainingName;
    }

    public void setTrainingName(String trainingName)
    {
        this.trainingName = trainingName;
    }
}
