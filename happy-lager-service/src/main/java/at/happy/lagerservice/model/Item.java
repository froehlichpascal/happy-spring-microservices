package at.happy.lagerservice.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ITEMS")
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String shortName;

    @NonNull
    private String name;

    @NonNull
    private int available;
}
