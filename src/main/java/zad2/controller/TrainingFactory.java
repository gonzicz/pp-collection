package zad2.controller;

import zad2.Training;

import java.util.ArrayList;
import java.util.List;

public class TrainingFactory
{
    private List<Training> trainings = new ArrayList<Training>();

    public void addTraining(String trainingName, String trainingCategory, int numberOfParticipants, String trener, String term)
    {
        Training k = new Training(trainingName, trainingCategory,numberOfParticipants, trener, term);
        trainings.add(k);
    }

    public void showTraining()
    {
        for (Training training : trainings)
        {
            System.out.println(training.getTrainingName());
        }
    }
}
