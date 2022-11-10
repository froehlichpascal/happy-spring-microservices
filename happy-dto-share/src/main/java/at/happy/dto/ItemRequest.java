package at.happy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//TODO Duplicate

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemRequest {
        private String shortName;
}
