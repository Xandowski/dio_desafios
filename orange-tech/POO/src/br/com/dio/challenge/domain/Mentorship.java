package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentorship extends Content {
  private LocalDate mentorshipDate;

  @Override
  public double calculateExperience() {
    return XP_DEFAULT + 20d;
  }

  public void setMentorshipDate(LocalDate mentorshipDate) {
    this.mentorshipDate = mentorshipDate;
  }

  public LocalDate getMentorshipDate() {
    return mentorshipDate;
  }

  @Override
  public String toString() {
    return "Mentoria{Título='" + getTitle() + '\'' +
        ", Descrição='" + getDescription() + '\'' +
        ", Data da Mentoria='" + getMentorshipDate() + "'}";
  }

}
