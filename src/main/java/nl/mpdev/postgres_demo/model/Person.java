package nl.mpdev.postgres_demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Long id;
  private String name;


}
