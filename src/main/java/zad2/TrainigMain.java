package zad2;

import zad2.controller.TrainingFactory;

public class TrainigMain
{
    public static void main(String[] args)
    {
        TrainingFactory kr1 = new TrainingFactory();

        kr1.addTraining("Programowanie C", "IT", 10, "Jan Kowalski", " 12-12-2019r");
        kr1.addTraining("Programowanie JAVA", "IT", 18, "Sebastian Kalisz", " 01-01-2019r");
        kr1.addTraining("Kurs Prawa Jazdy", "Podniesienie kwalifikacji", 10, "Adam Zapierała", " 01-12-2019r");
        kr1.addTraining("Jeżdziectwo", "Wypoczynek", 8, "Michał Konopka", " 2-10-2019r");
        kr1.addTraining("Łowienie białej ryby", "Wypoczynek", 10, "Wacław Malinowski", " 10-03-2019r");
        kr1.addTraining("Kurs tańca towarzyskiego", "Rozrywka", 26, "Katarzyna Górska", " 01-11-2019r");

        kr1.showTraining();

    }
}
