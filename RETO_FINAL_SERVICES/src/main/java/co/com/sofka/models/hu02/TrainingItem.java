package co.com.sofka.models.hu02;

import lombok.Data;

import java.util.List;

public @Data class TrainingItem {
    private String trainingId;
    private String name;
    private String startingDate;
    private List<ApprenticesItem> apprentices = null;
    private List<CoachesItem> coaches = null;
    private String program;
}
