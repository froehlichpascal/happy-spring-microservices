package at.happy.happyverpackungservice.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PACK_LIST")
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PackList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    String item;
}
