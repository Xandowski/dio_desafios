package br.com.dio.challenge.domain;

public class Course extends Content {
  private int workload;

  public Course() {
  }

  public int getWorkload() {
    return workload;
  }

  public void setWorkload(int workload) {
    this.workload = workload;
  }

  @Override
  public double calculateExperience() {
    return XP_DEFAULT * workload;
  }

  @Override
  public String toString() {
    return "Curso{Título='" + getTitle() + '\'' +
        ", Descrição='" + getDescription() + '\'' +
        ", Carga horária='" + getWorkload() + " hora(s)'}";
  }
}
