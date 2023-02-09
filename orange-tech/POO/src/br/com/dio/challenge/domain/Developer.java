package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Developer {
  private String name;
  private Set<Content> subscribedContents = new LinkedHashSet<>();
  private Set<Content> finishedContents = new LinkedHashSet<>();

  public void subscribeToBootcamp(Bootcamp bootcamp) {
    this.subscribedContents.addAll(bootcamp.getContents());
    bootcamp.getSubscribedDevelopers().add(this);
  };

  public void toProress() {
    Optional<Content> content = this.subscribedContents.stream().findFirst();
    if (content.isPresent()) {
      this.finishedContents.add(content.get());
      this.subscribedContents.remove(content.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo!");
    }
  };

  public double calculateTotalExperience() {
    return this.finishedContents.stream().mapToDouble(Content::calculateExperience).sum();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Content> getSubscribedContents() {
    return subscribedContents;
  }

  public void setSubscribedContents(Set<Content> subscribedContents) {
    this.subscribedContents = subscribedContents;
  }

  public Set<Content> getFinishedContents() {
    return finishedContents;
  }

  public void setFinishedContents(Set<Content> finishedContents) {
    this.finishedContents = finishedContents;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((subscribedContents == null) ? 0 : subscribedContents.hashCode());
    result = prime * result + ((finishedContents == null) ? 0 : finishedContents.hashCode());
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
    Developer other = (Developer) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (subscribedContents == null) {
      if (other.subscribedContents != null)
        return false;
    } else if (!subscribedContents.equals(other.subscribedContents))
      return false;
    if (finishedContents == null) {
      if (other.finishedContents != null)
        return false;
    } else if (!finishedContents.equals(other.finishedContents))
      return false;
    return true;
  };
}
