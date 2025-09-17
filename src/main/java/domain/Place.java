package domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

public record Place(
		Long id,
		String name,
		String slug, String state,
		@CreatedDate LocalDateTime createdAt,
		@LastModifiedBy LocalDateTime updateAt) {

	

}
