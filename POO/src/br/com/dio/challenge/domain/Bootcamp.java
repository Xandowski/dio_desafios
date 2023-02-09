package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
  private String name;
  private String description;
  private final LocalDate startDate = LocalDate.now();
  private final LocalDate finalDate = startDate.plusDays(45);
  private Set<Developer> subscribedDevelopers = new HashSet<>();
  private Set<Content> contents = new LinkedHashSet<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getFinalDate() {
    return finalDate;
  }

  public Set<Developer> getSubscribedDevelopers() {
    return subscribedDevelopers;
  }

  public void setSubscribedDevelopers(Set<Developer> subscribedDevelopers) {
    this.subscribedDevelopers = subscribedDevelopers;
  }

  public Set<Content> getContents() {
    return contents;
  }

  public void setContents(Set<Content> contents) {
    this.contents = contents;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
    result = prime * result + ((finalDate == null) ? 0 : finalDate.hashCode());
    result = prime * result + ((subscribedDevelopers == null) ? 0 : subscribedDevelopers.hashCode());
    result = prime * result + ((contents == null) ? 0 : contents.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Bootcamp other = (Bootcamp) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (startDate == null) {
      if (other.startDate != null)
        return false;
    } else if (!startDate.equals(other.startDate))
      return false;
    if (finalDate == null) {
      if (other.finalDate != null)
        return false;
    } else if (!finalDate.equals(other.finalDate))
      return false;
    if (subscribedDevelopers == null) {
      if (other.subscribedDevelopers != null)
        return false;
    } else if (!subscribedDevelopers.equals(other.subscribedDevelopers))
      return false;
    if (contents == null) {
      if (other.contents != null)
        return false;
    } else if (!contents.equals(other.contents))
      return false;
    return true;
  }

}
